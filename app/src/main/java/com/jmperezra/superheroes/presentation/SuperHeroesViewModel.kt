package com.jmperezra.superheroes.presentation

import androidx.lifecycle.ViewModel
import com.jmperezra.superheroes.domain.GetSuperHeroesFeedUseCase
import com.jmperezra.superheroes.domain.SuperHeroe
import kotlin.concurrent.thread

class SuperHeroesViewModel(private val superHeroesFeedUseCase: GetSuperHeroesFeedUseCase) :
    ViewModel() {

    fun obtainSuperHeroes(callback: SuperHeroesCallback) {
        thread {
            val superHeroes = superHeroesFeedUseCase.execute()
            callback.onCall(superHeroes)
        }
    }
}