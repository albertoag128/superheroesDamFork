package com.jmperezra.superheroes.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jmperezra.superheroes.domain.GetSuperHeroesFeedUseCase
import com.jmperezra.superheroes.domain.SuperHeroe
import kotlinx.coroutines.*
import kotlin.concurrent.thread

class SuperHeroesViewModel(private val superHeroesFeedUseCase: GetSuperHeroesFeedUseCase) :
    ViewModel() {

    fun obtainSuperHeroes(callback: SuperHeroesCallback) {
        viewModelScope.launch(Dispatchers.IO) {
            val superHeroes = superHeroesFeedUseCase.execute()
            withContext(Dispatchers.Main) {
                callback.onCall(superHeroes)
            }
        }
    }
}