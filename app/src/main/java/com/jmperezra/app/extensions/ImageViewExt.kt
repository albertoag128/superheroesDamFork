package com.jmperezra.app.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.jmperezra.superheroes.R

fun ImageView.loadUrl(url: String){
    Glide.with(this)
        .load(url)
        .into(this)
}