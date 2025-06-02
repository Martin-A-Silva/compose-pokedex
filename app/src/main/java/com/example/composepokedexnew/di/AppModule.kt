package com.example.composepokedexnew.di

import com.example.composepokedexnew.data.remote.PokeApi
import com.example.composepokedexnew.data.remote.repository.PokemonRepository
import com.example.composepokedexnew.util.Constants.BASE_URL
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(api: PokeApi) = PokemonRepository(api)

    @Singleton
    @Provides
    fun providePokeApi(): PokeApi {
        return Retrofit.Builder()
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                        .create()
                )
            )
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }
}