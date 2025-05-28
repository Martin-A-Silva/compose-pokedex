package com.example.composepokedexnew.data.remote.repository

import com.example.composepokedexnew.data.remote.PokeApi
import com.example.composepokedexnew.data.remote.responses.Pokemon
import com.example.composepokedexnew.data.remote.responses.PokemonList
import com.example.composepokedexnew.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error(null, "unknown error ocurred")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error(null, "unknown error ocurred")
        }
        return Resource.Success(response)
    }
}
