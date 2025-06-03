package com.example.composepokedexnew.util

fun String.capitalize() : String {
    return this.replaceFirstChar {
        it.uppercase()
    }
}