package com.jmperezra.superheroes.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jmperezra.app.commons.MoshiJSerializer
import com.jmperezra.superheroes.R
import com.jmperezra.superheroes.data.SuperHeroesDataRepository
import com.jmperezra.superheroes.data.local.SuperHeroesLocalSource
import com.jmperezra.superheroes.domain.SuperHeroe
import com.jmperezra.superheroes.domain.SuperHeroesRepository

class SuperHeroesListActivity : AppCompatActivity() {

    val viewModel = SuperHeroesFactory.getViewModel(
        getSharedPreferences("nombre_shared_pref",MODE_PRIVATE)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superHeroe = viewModel.obtainSuperHeroes().first()
    }
}