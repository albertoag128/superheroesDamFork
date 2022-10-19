package com.jmperezra.superheroes.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.jmperezra.app.commons.GsonJSerializer
import com.jmperezra.app.commons.KSerializer
import com.jmperezra.superheroes.R
import com.jmperezra.superheroes.domain.SuperHeroe
import kotlin.concurrent.thread
import kotlin.jvm.Throws

class SuperHeroesListActivity : AppCompatActivity() {

    val viewModel by lazy {
        SuperHeroesFactory.getViewModel(
            getSharedPreferences("nombre_shared_pref", MODE_PRIVATE)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSuperHeroes()
    }

    fun getSuperHeroes() {
        viewModel.obtainSuperHeroes(object : SuperHeroesCallback {
            override fun onCall(superHeroes: List<SuperHeroe>) {
                Log.d("@dev", "Ejecutado...")
                runOnUiThread {
                    findViewById<TextView>(R.id.label_name).text = superHeroes.first().name
                }
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("@dev", "Destroy...")
    }
}