package com.jmperezra.superheroes.data.local

import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroesMockLocalSource : SuperHeroesLocalSource {

    override fun save(superHeroes: List<SuperHeroe>) {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<SuperHeroe> {
        Thread.sleep(5000)
        return mutableListOf(
            SuperHeroe(1, "SuperMan"),
            SuperHeroe(2, "SpiderMan"),
            SuperHeroe(3, "CatWoman")
        )
    }

    override fun findById(superHeroeId: Int): SuperHeroe? {
        TODO("Not yet implemented")
    }
}