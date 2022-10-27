package com.jmperezra.superheroes.domain


data class SuperHeroe(val id: Int, val name: String, val imageUrl: String, val biography: Biography)
data class Biography(val id: Int, val fullName: String, val alterEgos: String)