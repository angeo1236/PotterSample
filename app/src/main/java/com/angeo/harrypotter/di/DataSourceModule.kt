package com.angeo.harrypotter.di



import com.angeo.harrypotter.data.remote.RemoteDataSource
import com.angeo.harrypotter.data.remote.RemoteDataSourceImpl
import org.koin.dsl.module

/**
 * Created by angeooo on 05-Jun-20.
 */


val dataSourceModule = module {
    single<RemoteDataSource> { RemoteDataSourceImpl(service = get()) }
}