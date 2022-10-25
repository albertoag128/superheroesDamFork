package com.jmperezra.app.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jmperezra.superheroes.data.local.db.SuperHeroeDao
import com.jmperezra.superheroes.data.local.db.SuperHeroeEntity

@Database(entities = [SuperHeroeEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun superHeroeDao(): SuperHeroeDao
}