package com.angeo.harrypotter.data.service



import com.angeo.harrypotter.model.Character
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by angeooo on 05-Jun-20.
 */


interface HarryPotterApiService {


    @GET("api/characters/house/{house}")
    suspend fun getCharacters(@Path("house") type: String): List<Character>


}