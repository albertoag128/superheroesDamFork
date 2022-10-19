package com.jmperezra.superheroes.domain

class GetSuperHeroesFeedUseCase(val repository: SuperHeroesRepository) {

    fun execute(): List<SuperHeroe> {
        return repository.getSuperHeroes()
    }
}