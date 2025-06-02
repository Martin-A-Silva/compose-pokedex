package com.example.composepokedexnew.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.composepokedexnew.data.remote.repository.PokemonRepository
import com.example.composepokedexnew.data.remote.responses.Pokemon
import com.example.composepokedexnew.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}