package com.angeo.harrypotter.data.repository



import com.angeo.harrypotter.model.Character

/**
 * Created by angeooo on 04-Jun-20.
 */


interface Repository {

    suspend fun getCharacters(type: String) : List<Character>

}