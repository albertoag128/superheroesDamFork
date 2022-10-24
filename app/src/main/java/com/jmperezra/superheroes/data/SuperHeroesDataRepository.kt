package com.jmperezra.superheroes.data

import com.jmperezra.superheroes.data.local.SuperHeroesLocalSource
import com.jmperezra.superheroes.domain.SuperHeroe
import com.jmperezra.superheroes.domain.SuperHeroesRepository

class SuperHeroesDataRepository(private val localSource: SuperHeroesLocalSource) :
    SuperHeroesRepository {

    override fun saveSuperHeroes(superHeroes: List<SuperHeroe>) {
        localSource.save(superHeroes)
    }

    override fun getSuperHeroes(): List<SuperHeroe> = localSource.getAll()

    override fun getSuperHeroe(superHeroeId: Int): SuperHeroe? = localSource.findById(superHeroeId)

}