package com.jmperezra.superheroes.data.local.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val SUPERHEROES_TABLA_NAME = "superheroes"
const val SUPERHEROES_ID = "id"

@Entity(tableName = SUPERHEROES_TABLA_NAME)
data class SuperHeroeEntity(
    @PrimaryKey @ColumnInfo(name = SUPERHEROES_ID) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "image_url") val imageUrl: String
)