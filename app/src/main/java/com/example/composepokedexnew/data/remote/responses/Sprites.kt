package com.example.composepokedexnew.data.remote.responses

import com.google.gson.annotations.SerializedName

data class Sprites(
    val backDefault: String,
    val backFemale: String,
    val backShiny: String,
    val backShinyFemale: String,
    val frontDefault: String,
    val frontFemale: String,
    val frontShiny: String,
    val frontShinyFemale: String,
    val other: Other,
    val versions: Versions
)
