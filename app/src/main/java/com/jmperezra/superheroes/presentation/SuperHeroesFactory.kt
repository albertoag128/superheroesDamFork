package com.jmperezra.superheroes.presentation

import android.content.SharedPreferences
import com.jmperezra.app.commons.GsonJSerializer
import com.jmperezra.app.commons.MoshiJSerializer
import com.jmperezra.superheroes.data.SuperHeroesDataRepository
import com.jmperezra.superheroes.data.local.SuperHeroesDataLocalSource
import com.jmperezra.superheroes.data.local.SuperHeroesMockLocalSource
import com.jmperezra.superheroes.domain.GetSuperHeroesFeedUseCase

class SuperHeroesFactory {

    companion object {
        fun getViewModel(sharedPreferences: SharedPreferences): SuperHeroesViewModel {
            return SuperHeroesViewModel(
                GetSuperHeroesFeedUseCase(
                    SuperHeroesDataRepository(
                        SuperHeroesDataLocalSource(sharedPreferences, GsonJSerializer())
                    )
                )
            )
        }
    }
}