package com.jmperezra.superheroes.presentation

import androidx.lifecycle.ViewModel
import com.jmperezra.superheroes.domain.GetSuperHeroesFeedUseCase
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroesViewModel(private val superHeroesFeedUseCase: GetSuperHeroesFeedUseCase) :
    ViewModel() {

    fun obtainSuperHeroes(): List<SuperHeroe> {
        return superHeroesFeedUseCase.execute()
    }

}