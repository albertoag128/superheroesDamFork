package com.jmperezra.superheroes.data.remote

import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroesRemoteSource(private val apiClient: ApiClient) {

    fun getSuperHeroes(): List<SuperHeroe> =
        apiClient.getSuperHeroes().map { apiSuperHeroe ->
            apiSuperHeroe.toDomain()
        }
}