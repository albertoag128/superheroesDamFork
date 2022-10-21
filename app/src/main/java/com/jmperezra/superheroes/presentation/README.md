# Capa Presentación

## Coroutines

Nos sirven para sustituir los hilos. Necesitamos meter las siguientes dependencias:

- implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1'
- implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1" (Acoplarlo al ciclo de vida)

Tenemos dos scopes donde ejecutar la Coroutines:

- GlobalScope: A nivel de aplicación, el hilo dura hasta que cerremos la app.
- viewModelScope: A nivel de ViewModel (Activity/Fragment), el hilo dura hasta que se elimine el
  ViewModel

Ejemplo:

```
    fun obtainSuperHeroes(callback: SuperHeroesCallback) {
        viewModelScope.launch(Dispatchers.IO) {
            val superHeroes = superHeroesFeedUseCase.execute()
            withContext(Dispatchers.Main) {
                callback.onCall(superHeroes)
            }
        }
    }
```
