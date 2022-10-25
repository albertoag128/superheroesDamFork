package com.jmperezra.superheroes.data.local.memory

import com.jmperezra.superheroes.data.local.SuperHeroesLocalDataSource
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroesMockLocalSource : SuperHeroesLocalDataSource {

    override fun save(superHeroes: List<SuperHeroe>) {

    }

    override fun getAll(): List<SuperHeroe> {
        return mutableListOf(
            SuperHeroe(
                1,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                2,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                3,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                1,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                2,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                3,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                1,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                2,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                3,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                1,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                2,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                3,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                1,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                2,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                3,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                1,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                2,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            ),
            SuperHeroe(
                3,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg"
            )
        )
    }

    override fun findById(superHeroeId: Int): SuperHeroe? =
        getAll().first { it.id == superHeroeId }

    override fun delete(superHeroeId: Int) {}
}