package com.angeo.harrypotter.data.remote


import com.angeo.harrypotter.data.service.HarryPotterApiService

/**
 * Created by angeooo on 05-Jun-20.
 */


class RemoteDataSourceImpl(private val service: HarryPotterApiService) : RemoteDataSource {

    override suspend fun getCharacters(type: String) = service.getCharacters(type)

}