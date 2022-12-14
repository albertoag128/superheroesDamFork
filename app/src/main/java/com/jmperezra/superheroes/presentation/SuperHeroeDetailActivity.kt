package com.jmperezra.superheroes.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jmperezra.superheroes.R

class SuperHeroeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_superheroedetail)
        setupView()
        val superHeroeId = intent.getIntExtra(KEY_SUPERHEROE_ID, 0)
        supportActionBar?.title = "SuperHeroe:$superHeroeId"
        loadSuperHeroe(superHeroeId)
    }

    private fun setupView() {

    }

    private fun loadSuperHeroe(superHeroeId: Int) {
        //ViewModel -> UseCase -> Repository -> Data
    }

    companion object {
        val KEY_SUPERHEROE_ID = "SUPERHEROE_ID_KEY"
        fun createIntent(context: Context, superHeroeId: Int): Intent {
            val intent = Intent(context, SuperHeroeDetailActivity::class.java)
            intent.putExtra(KEY_SUPERHEROE_ID, superHeroeId)
            return intent
        }
    }
}