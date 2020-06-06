package com.angeo.harrypotter.data.remote

import com.angeo.harrypotter.model.Character

/**
 * Created by angeooo on 05-Jun-20.
 */


interface RemoteDataSource {

    suspend fun getCharacters(type: String) : List<Character>

}