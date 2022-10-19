package com.jmperezra.superheroes.domain

interface SuperHeroesRepository {
    fun saveSuperHeroes(superHeroes: List<SuperHeroe>)
}