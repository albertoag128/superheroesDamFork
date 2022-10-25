package com.jmperezra.superheroes.data.local

import com.jmperezra.superheroes.domain.SuperHeroe

interface SuperHeroesLocalDataSource {
    fun save(superHeroes: List<SuperHeroe>)
    fun getAll(): List<SuperHeroe>
    fun findById(superHeroeId: Int): SuperHeroe?
    fun delete(superHeroeId: Int)
}