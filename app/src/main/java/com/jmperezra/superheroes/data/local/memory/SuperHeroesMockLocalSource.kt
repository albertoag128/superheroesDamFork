package com.jmperezra.superheroes.data.local.memory

import com.jmperezra.superheroes.data.local.SuperHeroesLocalDataSource
import com.jmperezra.superheroes.domain.Biography
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroesMockLocalSource : SuperHeroesLocalDataSource {

    override fun save(superHeroes: List<SuperHeroe>) {

    }

    override fun getAll(): List<SuperHeroe> {
        return mutableListOf(
            SuperHeroe(
                1,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(1, "bio1", "ae1")
            ),
            SuperHeroe(
                2,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(2, "bio2", "ae2")
            ),
            SuperHeroe(
                3,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(3, "bio3", "ae3")

            ),
            SuperHeroe(
                4,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(4, "bio4", "ae4")
            ),
            SuperHeroe(
                5,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(5, "bio5", "ae5")
            ),
            SuperHeroe(
                6,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(6, "bio6", "ae6")
            ),
            SuperHeroe(
                7,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(7, "bio7", "ae7")
            ),
            SuperHeroe(
                8,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(8, "bio8", "ae8")
            ),
            SuperHeroe(
                9,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(9, "bio9", "ae9")
            ),
            SuperHeroe(
                10,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(10, "bio10", "ae10")
            ),
            SuperHeroe(
                11,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(11, "bio11", "ae11")
            ),
            SuperHeroe(
                12,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(12, "bio12", "ae12")
            ),
            SuperHeroe(
                13,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(13, "bio13", "ae13")
            ),
            SuperHeroe(
                14,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(14, "bio14", "ae14")
            ),
            SuperHeroe(
                15,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(15, "bio15", "ae15")
            ),
            SuperHeroe(
                16,
                "SuperMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(16, "bio16", "ae16")
            ),
            SuperHeroe(
                17,
                "SpiderMan",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(17, "bio17", "ae17")
            ),
            SuperHeroe(
                18,
                "CatWoman",
                "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/1-a-bomb.jpg",
                Biography(18, "bio18", "ae18")

            )
        )
    }

    override fun findById(superHeroeId: Int): SuperHeroe? =
        getAll().first { it.id == superHeroeId }

    override fun delete(superHeroeId: Int) {}
}