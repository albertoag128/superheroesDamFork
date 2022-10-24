package com.jmperezra.superheroes.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jmperezra.superheroes.R
import com.jmperezra.superheroes.databinding.ActivitySuperheroesBinding
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroesListActivity : AppCompatActivity() {

    private var binding: ActivitySuperheroesBinding? = null

    private val viewModel by lazy {
        SuperHeroesFactory.getViewModel(
            applicationContext,
            getSharedPreferences("nombre_shared_pref", MODE_PRIVATE)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_superheroes)
        binding = ActivitySuperheroesBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        loadSuperHeroes()
    }

    private fun loadSuperHeroes() {
        viewModel.obtainSuperHeroes(object : SuperHeroesCallback {
            override fun onCall(superHeroes: List<SuperHeroe>) {
                bind(superHeroes)
            }
        })
    }

    private fun bind(superHeroes: List<SuperHeroe>) {
        binding?.apply {
            name.text = "asd"
            realName.text = "asd"
        }
    }
}