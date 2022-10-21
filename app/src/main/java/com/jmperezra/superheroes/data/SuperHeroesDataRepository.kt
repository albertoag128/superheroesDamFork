package com.jmperezra.superheroes.data

import com.jmperezra.superheroes.data.local.SuperHeroesDataLocalSource
import com.jmperezra.superheroes.data.local.SuperHeroesLocalSource
import com.jmperezra.superheroes.domain.SuperHeroe
import com.jmperezra.superheroes.domain.SuperHeroesRepository

class SuperHeroesDataRepository(private val localSource: SuperHeroesLocalSource) :
    SuperHeroesRepository {

    override fun saveSuperHeroes(superHeroes: List<SuperHeroe>) {
        localSource.save(superHeroes)
    }

    override fun getSuperHeroes(): List<SuperHeroe> {
        return localSource.getAll()
    }
}