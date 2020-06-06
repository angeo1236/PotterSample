package com.angeo.harrypotter.ui.main



import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.angeo.harrypotter.R
import com.angeo.harrypotter.databinding.ItemHouseBinding
import com.angeo.harrypotter.ui.HouseType
import com.angeo.harrypotter.ui.HouseType.*

/**
 * Created by angeooo on 04-Jun-20.
 */


class HouseAdapter(val action: (ImageView, HouseType) -> Unit) :
    RecyclerView.Adapter<HouseAdapter.MainViewHolder>() {

    private val items = mutableListOf(
        Gryffindor,
        Slytherin,
        Ravenclaw,
        Hufflepuff
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataBindingUtil.inflate<ItemHouseBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_house,
            parent,
            false
        ).let { MainViewHolder(it) }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) =
        holder.bind(items[position])

    inner class MainViewHolder(private val binding: ItemHouseBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: HouseType) {
            binding.apply {
                house = item
                executePendingBindings()
                root.setOnClickListener { action(binding.imageViewItemHouseLogo, item) }
            }
        }
    }
}