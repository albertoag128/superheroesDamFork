package com.jmperezra.superheroes.presentation

import android.content.SharedPreferences
import com.jmperezra.commons.GsonJSerializer
import com.jmperezra.superheroes.data.SuperHeroesDataRepository
import com.jmperezra.superheroes.data.local.SuperHeroesLocalSource
import com.jmperezra.superheroes.domain.GetSuperHeroesFeedUseCase

class SuperHeroesFactory {

    companion object {
        fun getViewModel(sharedPreferences: SharedPreferences): SuperHeroesViewModel {
            return SuperHeroesViewModel(
                GetSuperHeroesFeedUseCase(
                    SuperHeroesDataRepository(
                        SuperHeroesLocalSource(sharedPreferences, GsonJSerializer())
                    )
                )
            )
        }
    }
}