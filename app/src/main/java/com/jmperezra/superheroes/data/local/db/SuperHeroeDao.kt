package com.jmperezra.superheroes.data.local.db

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.jmperezra.superheroes.domain.SuperHeroe

@Dao
interface SuperHeroeDao {

    @Query("SELECT * FROM $SUPERHEROES_TABLA_NAME")
    fun getAll(): List<SuperHeroeEntity>

    @Insert(onConflict = REPLACE)
    fun save(vararg superHeroes: SuperHeroeEntity)

    @Query("SELECT * FROM $SUPERHEROES_TABLA_NAME WHERE $SUPERHEROES_ID = :superHeroeId")
    fun findById(superHeroeId: Int): SuperHeroeEntity?

    @Delete
    fun delete(superHeroe: SuperHeroeEntity)

    @Query(
        "SELECT * FROM $SUPERHEROES_TABLA_NAME as sh " +
                "JOIN $BIOGRAPHY_TABLA_NAME as bio ON sh.id = bio.id"
    )
    fun getSuperHeroeMapWithBiography(): Map<SuperHeroeEntity, BiographyEntity>

    @Query("")
    fun getSuperHeroe
}