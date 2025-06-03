package com.example.composepokedexnew.util

import androidx.compose.ui.graphics.Color
import com.example.composepokedexnew.data.remote.responses.Stat
import com.example.composepokedexnew.data.remote.responses.Type
import com.example.composepokedexnew.ui.theme.AtkColor
import com.example.composepokedexnew.ui.theme.DefColor
import com.example.composepokedexnew.ui.theme.HPColor
import com.example.composepokedexnew.ui.theme.SpAtkColor
import com.example.composepokedexnew.ui.theme.SpDefColor
import com.example.composepokedexnew.ui.theme.SpdColor

fun parseTypeToColor(type: Type) : Color {
    return when (type.type.name) {
        "normal" -> Color(0xFFA8A878)
        "fighting" -> Color(0xFFC03028)
        "flying" -> Color(0xFFA890F0)
        "poison" -> Color(0xFFA040A0)
        "ground" -> Color(0xFFE0C068)
        "rock" -> Color(0xFFB8A038)
        "bug" -> Color(0xFFA8B820)
        "ghost" -> Color(0xFF705898)
        "steel" -> Color(0xFFB8B8D0)
        "fire" -> Color(0xFFF08030)
        "water" -> Color(0xFF6890F0)
        "grass" -> Color(0xFF78C850)
        "electric" -> Color(0xFFF8D030)
        "psychic" -> Color(0xFFF85888)
        "ice" -> Color(0xFF98D8D8)
        "dragon" -> Color(0xFF7038F8)
        "dark" -> Color(0xFF705848)
        "fairy" -> Color(0xFFEE99AC)
        else -> Color.White
    }
}

fun parseStatToColor(stat: String) : Color {
    return when (stat) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat) : String {
    return when (stat.stat.name.lowercase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}