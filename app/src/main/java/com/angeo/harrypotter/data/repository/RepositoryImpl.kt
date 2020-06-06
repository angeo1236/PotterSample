package com.angeo.harrypotter.data.repository



import com.angeo.harrypotter.data.remote.RemoteDataSource

/**
 * Created by angeooo on 04-Jun-20.
 */


class RepositoryImpl(private val remoteDataSource: RemoteDataSource) : Repository {

    override suspend fun getCharacters(type: String) =
        remoteDataSource.getCharacters(type)

}