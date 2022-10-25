package com.jmperezra.superheroes.presentation.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jmperezra.app.extensions.loadUrl
import com.jmperezra.superheroes.R
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroeViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun render(model: SuperHeroe) {
        view.findViewById<ImageView>(R.id.image).loadUrl(
            model.imageUrl
        )
        view.findViewById<TextView>(R.id.name).text = model.name
        view.findViewById<TextView>(R.id.real_name).text = model.id.toString()
    }

}