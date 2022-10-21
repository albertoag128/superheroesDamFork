package com.jmperezra.superheroes.data.local

import com.jmperezra.superheroes.domain.SuperHeroe

interface SuperHeroesLocalSource {
    fun save(superHeroes: List<SuperHeroe>)
    fun getAll(): List<SuperHeroe>
    fun findById(superHeroeId: Int): SuperHeroe?
}