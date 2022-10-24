package com.jmperezra.superheroes.data.local.db

import android.content.Context
import androidx.room.Room
import com.jmperezra.app.data.AppDatabase
import com.jmperezra.superheroes.data.local.SuperHeroesLocalDataSource
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroeDbLocalDataSource(val applicationContext: Context) : SuperHeroesLocalDataSource {

    val db = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java, "db-superheroe"
    ).build()

    override fun save(superHeroes: List<SuperHeroe>) {
        TODO("Not yet implemented")
    }

    override fun getAll() = db.superHeroeDao().getAll().map { superHeroeEntity ->
        superHeroeEntity.toDomain()
    }

    override fun findById(superHeroeId: Int): SuperHeroe? {
        TODO("Not yet implemented")
    }
}