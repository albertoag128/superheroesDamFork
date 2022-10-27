package com.jmperezra.superheroes.data.local.db

import androidx.room.*

const val SUPERHEROES_TABLA_NAME = "superheroes"
const val BIOGRAPHY_TABLA_NAME = "biography"
const val SUPERHEROES_ID = "id"
const val BIOGRAPHY_ID = "id"

@Entity(tableName = SUPERHEROES_TABLA_NAME)
data class SuperHeroeEntity(
    @PrimaryKey @ColumnInfo(name = SUPERHEROES_ID) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "image_url") val imageUrl: String
)

@Entity(tableName = BIOGRAPHY_TABLA_NAME)
data class BiographyEntity(
    @PrimaryKey @ColumnInfo(name = BIOGRAPHY_ID) val id: Int,
    @ColumnInfo(name = "full_name") val fullName: String,
    @ColumnInfo(name = "alter_egos") val alterEgos: String,
    @ColumnInfo(name = "superheroe_id") val superHeroeId: Int,
)

data class SuperHeroeBiography(
    @Embedded val superHeroe: SuperHeroeEntity,
    @Relation(
        parentColumn = SUPERHEROES_ID,
        entityColumn = "superheroe_id"
    )
    val biography: BiographyEntity
)