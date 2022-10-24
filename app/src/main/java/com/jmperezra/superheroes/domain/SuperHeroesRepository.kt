package com.jmperezra.superheroes.domain

interface SuperHeroesRepository {
    fun saveSuperHeroes(superHeroes: List<SuperHeroe>)
    fun getSuperHeroes(): List<SuperHeroe>
    fun getSuperHeroe(superHeroeId: Int): SuperHeroe?
}