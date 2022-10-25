package com.jmperezra.superheroes.data.local.db

import androidx.room.Dao
import androidx.room.Query

@Dao
interface SuperHeroeDao {

    @Query("SELECT * FROM $SUPERHEROES_TABLA_NAME")
    fun getAll(): List<SuperHeroeEntity>

}