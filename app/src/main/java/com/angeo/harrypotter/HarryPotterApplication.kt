package com.angeo.harrypotter


import android.app.Application
import com.angeo.harrypotter.di.dataSourceModule
import com.angeo.harrypotter.di.networkModule
import com.angeo.harrypotter.di.repositoryModule
import com.angeo.harrypotter.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by angeooo on 04-Jun-20.
 */


class HarryPotterApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@HarryPotterApplication)
            modules(dataSourceModule)
            modules(repositoryModule)
            modules(viewModelModule)
            modules(networkModule)
        }
    }

}