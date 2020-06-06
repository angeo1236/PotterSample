package com.angeo.harrypotter.di



import com.angeo.harrypotter.ui.detail.DetailViewModel
import com.angeo.harrypotter.ui.HouseType
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by angeooo on 05-Jun-20.
 */


val viewModelModule = module {
    viewModel { (type: HouseType) -> DetailViewModel(type, repository = get()) }
}