package ru.urinoff.filmss.data.network

import retrofit2.Response
import retrofit2.http.GET
import ru.urinoff.filmss.data.models.Movies

interface ApiService {


    @GET("/shows")
    suspend fun getAllMovies(): Response<List<Movies>>
}