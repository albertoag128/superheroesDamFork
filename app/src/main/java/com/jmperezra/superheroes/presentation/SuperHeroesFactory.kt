package com.jmperezra.superheroes.presentation

import android.content.Context
import android.content.SharedPreferences
import com.jmperezra.superheroes.data.SuperHeroesDataRepository
import com.jmperezra.superheroes.data.local.db.SuperHeroeDbLocalDataSource
import com.jmperezra.superheroes.domain.GetSuperHeroesFeedUseCase

class SuperHeroesFactory {

    companion object {
        fun getViewModel(
            context: Context,
            sharedPreferences: SharedPreferences
        ): SuperHeroesViewModel {
            return SuperHeroesViewModel(
                GetSuperHeroesFeedUseCase(
                    SuperHeroesDataRepository(
                        SuperHeroeDbLocalDataSource(context)
                    )
                )
            )
        }
    }
}