package com.example.countriesapp.rest

import com.example.countriesapp.model.Countries
import retrofit2.Response

interface CountriesRepo {

    suspend fun getCountries(): Response<List<Countries>>
}

class CountriesRepoImpl(
    private val countriesAPI: CountriesAPI
) : CountriesRepo {

    override suspend fun getCountries(): Response<List<Countries>> =
        countriesAPI.getCountries()
}