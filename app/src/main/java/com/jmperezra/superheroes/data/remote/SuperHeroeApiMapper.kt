package com.jmperezra.superheroes.data.remote

import android.widget.TextView
import com.jmperezra.superheroes.domain.SuperHeroe

fun SuperHeroeApiModel.toDomain(): SuperHeroe {
    return SuperHeroe(this.id, this.name)
}