package com.angeo.harrypotter.ui.detail



import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import com.angeo.harrypotter.R
import com.angeo.harrypotter.base.BaseActivity
import com.angeo.harrypotter.databinding.ActivityCharactersBinding
import com.angeo.harrypotter.ui.HouseType
import com.angeo.harrypotter.ui.SpaceItemDecoration
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

/**
 * Created by angeooo on 05-Jun-20.
 */


class DetailActivity : BaseActivity() {

    companion object {
        private const val KEY_HOUSE = "house"
        fun startActivityWithTransition(
            activity: Activity,
            imageView: ImageView,
            type: HouseType
        ) {
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra(KEY_HOUSE, type)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                activity, imageView, imageView.transitionName
            )
            activity.startActivity(intent, options.toBundle())
        }
    }

    private val binding by binding<ActivityCharactersBinding>(R.layout.activity_characters)
    private val house by lazy { intent.getSerializableExtra(KEY_HOUSE) as HouseType }
    private val viewModel: DetailViewModel by viewModel { parametersOf(house) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            house = this@DetailActivity.house
            lifecycleOwner = this@DetailActivity
            viewModel = this@DetailActivity.viewModel
        }
        viewModel.characterList.observe(::getLifecycle) {
            viewModel.loading.value = false
        }
    }

}