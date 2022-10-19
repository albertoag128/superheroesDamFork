package com.jmperezra.superheroes.domain

class GetSuperHeroesFeedUseCase (val repository: SuperHeroesRepository) {

    fun execute(): List<SuperHeroe> {
        repository.saveSuperHeroes(emptyList())
        return emptyList()
    }
}