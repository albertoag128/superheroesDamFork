package com.jmperezra.superheroes.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jmperezra.superheroes.R
import com.jmperezra.superheroes.databinding.ActivitySuperheroesBinding
import com.jmperezra.superheroes.domain.SuperHeroe
import com.jmperezra.superheroes.presentation.adapter.SuperHeroeAdapter

class SuperHeroesListActivity : AppCompatActivity() {

    private var binding: ActivitySuperheroesBinding? = null
    private var superHeroeAdapter: SuperHeroeAdapter = SuperHeroeAdapter()

    private val viewModel by lazy {
        SuperHeroesFactory.getViewModel(
            applicationContext,
            getSharedPreferences("nombre_shared_pref", MODE_PRIVATE)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
        loadSuperHeroes()
    }

    private fun setupView() {
        binding = ActivitySuperheroesBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.apply {
            listSuperheroes.adapter = superHeroeAdapter
            val verticalLayout = LinearLayoutManager(this@SuperHeroesListActivity)
            verticalLayout.orientation = LinearLayoutManager.VERTICAL
            listSuperheroes.layoutManager = verticalLayout
        }
    }

    private fun loadSuperHeroes() {
        viewModel.obtainSuperHeroes(object : SuperHeroesCallback {
            override fun onCall(superHeroes: List<SuperHeroe>) {
                updateList(superHeroes)
            }
        })
    }

    private fun updateList(superHeroes: List<SuperHeroe>) {
        superHeroeAdapter.loadList(superHeroes)
    }
}