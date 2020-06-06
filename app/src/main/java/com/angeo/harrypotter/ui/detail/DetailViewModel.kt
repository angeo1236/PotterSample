package com.angeo.harrypotter.ui.detail



import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.angeo.harrypotter.BuildConfig
import com.angeo.harrypotter.data.repository.Repository
import com.angeo.harrypotter.model.Character
import com.angeo.harrypotter.ui.HouseType
import kotlinx.coroutines.Dispatchers

/**
 * Created by angeooo on 04-Jun-20.
 */


class DetailViewModel(house: HouseType, private val repository: Repository) : ViewModel() {

    val characterList : LiveData<List<Character>> = liveData(Dispatchers.IO) {
        loading.postValue(true)
        emit(repository.getCharacters(house.name))
    }

    val loading = MutableLiveData<Boolean>()

}