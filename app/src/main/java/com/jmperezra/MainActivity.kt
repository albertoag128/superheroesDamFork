package com.jmperezra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jmperezra.superheroes.R
import com.jmperezra.superheroes.presentation.SuperHeroesListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<Button>(R.id.actionOpenSuperHeroes).setOnClickListener {
            val intent = Intent(this, SuperHeroesListActivity::class.java)
            startActivity(intent)
        }
    }
}