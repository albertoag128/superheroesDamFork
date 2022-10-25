package com.jmperezra.superheroes.data.local.db

import android.content.Context
import androidx.room.Query
import androidx.room.Room
import com.jmperezra.app.data.AppDatabase
import com.jmperezra.superheroes.data.local.SuperHeroesLocalDataSource
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroeDbLocalDataSource(val applicationContext: Context) : SuperHeroesLocalDataSource {

    val db = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java, "db-superheroe"
    ).build()

    init {
        db.clearAllTables()
    }

    override fun save(superHeroes: List<SuperHeroe>) {
        val entities = superHeroes.map { superHeroe ->
            superHeroe.toEntity()
        }
        db.superHeroeDao().save(*entities.toTypedArray())
    }

    override fun getAll() = db.superHeroeDao().getAll().map { superHeroeEntity ->
        superHeroeEntity.toDomain()
    }


    override fun findById(superHeroeId: Int): SuperHeroe? {
        return db.superHeroeDao().findById(superHeroeId)?.toDomain()
    }

    override fun delete(superHeroeId: Int) {
        findById(superHeroeId)?.let { superHeroe ->
            db.superHeroeDao().delete(superHeroe.toEntity())
        }
    }
}