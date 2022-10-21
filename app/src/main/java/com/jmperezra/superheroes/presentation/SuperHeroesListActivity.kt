package com.jmperezra.superheroes.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.jmperezra.app.extensions.loadUrl
import com.jmperezra.superheroes.R
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroesListActivity : AppCompatActivity() {

    private val viewModel by lazy {
        SuperHeroesFactory.getViewModel(
            getSharedPreferences("nombre_shared_pref", MODE_PRIVATE)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
        findViewById<TextView>(R.id.label_name).text = superHeroes.first().name
        findViewById<ImageView>(R.id.imgSuperHeroe)
            .loadUrl(superHeroes.first().imageUrl)
    }
}