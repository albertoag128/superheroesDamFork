package com.jmperezra.superheroes.data.local.xml

import android.content.SharedPreferences
import com.jmperezra.app.commons.KSerializer
import com.jmperezra.superheroes.data.local.SuperHeroesLocalDataSource
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroesXmlLocalDataSource(
    private val sharedPreferences: SharedPreferences,
    private val jSerializer: KSerializer
) : SuperHeroesLocalDataSource {

    override fun save(superHeroes: List<SuperHeroe>) {
        superHeroes.forEach { superHeroe ->
            sharedPreferences.edit().apply {
                putString(
                    superHeroe.id.toString(),
                    jSerializer.toJson(superHeroe, SuperHeroe::class.java)
                )
            }.apply()
        }
    }

    override fun getAll(): List<SuperHeroe> = sharedPreferences.all.map {
        jSerializer.fromJson(it.value as String, SuperHeroe::class.java)
    }

    override fun findById(superHeroeId: Int): SuperHeroe? {
        return sharedPreferences.getString(superHeroeId.toString(), null)?.let {
            jSerializer.fromJson(it, SuperHeroe::class.java)
        }
    }
}