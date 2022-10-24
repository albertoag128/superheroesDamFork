package com.jmperezra.superheroes.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jmperezra.superheroes.R
import com.jmperezra.superheroes.domain.SuperHeroe

class SuperHeroeAdapter : RecyclerView.Adapter<SuperHeroeViewHolder>() {

    private val dataSet: MutableList<SuperHeroe> = mutableListOf()

    fun loadList(superHeroes: List<SuperHeroe>) {
        dataSet.clear()
        dataSet.addAll(superHeroes)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_item_superheroe, parent, false)
        return SuperHeroeViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuperHeroeViewHolder, position: Int) {
        holder.render(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size
}