package com.jmperezra.superheroes.presentation

import com.jmperezra.superheroes.domain.SuperHeroe

interface SuperHeroesCallback {
    fun onCall(superHeroes: List<SuperHeroe>)
}