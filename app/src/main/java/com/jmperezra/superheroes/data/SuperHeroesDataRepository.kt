package com.jmperezra.superheroes.data

import com.jmperezra.superheroes.data.local.SuperHeroesLocalDataSource
import com.jmperezra.superheroes.data.local.memory.SuperHeroesMockLocalSource
import com.jmperezra.superheroes.domain.SuperHeroe
import com.jmperezra.superheroes.domain.SuperHeroesRepository

class SuperHeroesDataRepository(private val localSource: SuperHeroesLocalDataSource) :
    SuperHeroesRepository {

    override fun saveSuperHeroes(superHeroes: List<SuperHeroe>) {
        localSource.save(superHeroes)
    }

    override fun getSuperHeroes(): List<SuperHeroe> {
        saveSuperHeroes(SuperHeroesMockLocalSource().getAll())
        return localSource.getAll()
    }

    override fun getSuperHeroe(superHeroeId: Int): SuperHeroe? = localSource.findById(superHeroeId)

}