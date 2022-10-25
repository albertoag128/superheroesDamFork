package com.jmperezra.superheroes.presentation.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jmperezra.app.extensions.loadUrl
import com.jmperezra.superheroes.R
import com.jmperezra.superheroes.databinding.ViewItemSuperheroeBinding
import com.jmperezra.superheroes.domain.SuperHeroe
import com.jmperezra.superheroes.presentation.SuperHeroeDetailActivity

class SuperHeroeViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private var binding: ViewItemSuperheroeBinding? = null

    fun render(model: SuperHeroe) {
        binding = ViewItemSuperheroeBinding.bind(view)
        binding?.apply {
            image.loadUrl(model.imageUrl)
            name.text = model.name
            realName.text = model.id.toString()
        }
        view.setOnClickListener {
            view.context.startActivity(
                SuperHeroeDetailActivity.createIntent(
                    view.context,
                    model.id
                )
            )
        }
    }
}