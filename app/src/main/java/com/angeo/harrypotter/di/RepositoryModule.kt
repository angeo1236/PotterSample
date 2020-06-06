package com.angeo.harrypotter.di



import com.angeo.harrypotter.data.repository.Repository
import com.angeo.harrypotter.data.repository.RepositoryImpl
import org.koin.dsl.module

/**
 * Created by angeooo on 05-Jun-20.
 */


val repositoryModule = module {
    single<Repository> { RepositoryImpl(remoteDataSource = get()) }
}