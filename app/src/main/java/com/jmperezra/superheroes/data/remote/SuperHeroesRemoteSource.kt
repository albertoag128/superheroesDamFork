package com.jmperezra.superheroes.data.remote

import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroesRemoteSource(private val apiClient: ApiClient) {

    fun getSuperHeroes(): List<SuperHeroe> {
        val listApiModels = apiClient.getSuperHeroes()
        return listApiModels.map { apiSuperHeroe ->
            apiSuperHeroe.toDomain()
        }
    }

}