package com.jmperezra.superheroes.data.local.db

import com.jmperezra.superheroes.domain.SuperHeroe

fun SuperHeroeEntity.toDomain() = SuperHeroe(this.id, this.name, this.imageUrl)
fun SuperHeroe.toEntity() = SuperHeroeEntity(this.id, this.name, this.imageUrl)