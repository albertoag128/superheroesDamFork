package com.jmperezra.superheroes.data.remote

interface ApiClient {

    fun getSuperHeroes(): List<SuperHeroeApiModel>
}