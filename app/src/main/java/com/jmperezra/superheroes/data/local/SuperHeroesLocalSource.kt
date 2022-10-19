package com.jmperezra.superheroes.data.local

import android.content.SharedPreferences
import com.jmperezra.commons.KSerializer
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroesLocalSource(
    private val sharedPreferences: SharedPreferences,
    private val jSerializer: KSerializer
) {

    fun save(superHeroes: List<SuperHeroe>) {
        superHeroes.forEach { superHeroe ->
            sharedPreferences.edit().apply {
                putString(
                    superHeroe.id.toString(),
                    jSerializer.toJson(superHeroe, SuperHeroe::class.java)
                )
                apply()
            }
        }
    }

    fun getAll(): List<SuperHeroe> {
        val superHeroesList = mutableListOf<SuperHeroe>()
        sharedPreferences.all.forEach {
            superHeroesList.add(jSerializer.fromJson(it.value as String, SuperHeroe::class.java))
        }
        return superHeroesList
    }

    fun findById(superHeroeId: Int): SuperHeroe? {
        return sharedPreferences.getString(superHeroeId.toString(), null)?.let {
            jSerializer.fromJson(it, SuperHeroe::class.java)
        }
    }
}