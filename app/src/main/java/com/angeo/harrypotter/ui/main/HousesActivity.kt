package com.angeo.harrypotter.ui.main



import android.os.Bundle
import com.angeo.harrypotter.R
import com.angeo.harrypotter.base.BaseActivity
import com.angeo.harrypotter.databinding.ActivityHouseBinding
import com.angeo.harrypotter.ui.detail.DetailActivity.Companion.startActivityWithTransition

/**
 * Created by angeooo on 04-Jun-20.
 */


class HousesActivity : BaseActivity() {

    private val binding: ActivityHouseBinding by binding(R.layout.activity_house)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            lifecycleOwner = this@HousesActivity
            adapter = HouseAdapter { view, type ->
                startActivityWithTransition(this@HousesActivity, view, type)
            }
        }
    }

}