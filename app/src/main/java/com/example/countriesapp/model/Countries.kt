package com.example.countriesapp.model


import com.google.gson.annotations.SerializedName

data class Countries(
    @SerializedName("capital")
    val capital: String,
    @SerializedName("code")
    val code: String,
    @SerializedName("currency")
    val currency: Currency,
    @SerializedName("flag")
    val flag: String,
    @SerializedName("language")
    val language: Language,
    @SerializedName("name")
    val name: String,
    @SerializedName("region")
    val region: String
)