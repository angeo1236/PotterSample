package com.angeo.harrypotter.ui.detail



import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.angeo.harrypotter.R
import com.angeo.harrypotter.databinding.DialogCharacterBinding
import com.angeo.harrypotter.databinding.ItemCharacterBinding
import com.angeo.harrypotter.model.Character

/**
 * Created by angeooo on 05-Jun-20.
 */


class DetailAdapter : RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {

    var itemList = listOf<Character>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataBindingUtil.inflate<ItemCharacterBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_character,
            parent,
            false
        ).let {
            it.constraintLayoutItemArea.layoutParams.height = (parent.width / 3) * 2
            DetailViewHolder(it)
        }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) =
        holder.bind(itemList[position])

    inner class DetailViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Character) {
            binding.apply {
                character = item
                executePendingBindings()
                root.setOnClickListener {
                    MaterialDialog(root.context).show {
                        customView(
                            view = DataBindingUtil.inflate<DialogCharacterBinding>(
                                LayoutInflater.from(root.context),
                                R.layout.dialog_character,
                                null,
                                false
                            ).also {
                                it.character = binding.character
                                it.imageViewDialogDetailPhoto.clipToOutline = true
                            }.root
                        )
                        cornerRadius(root.context.resources.getDimension(R.dimen.dp_8))
                    }
                }
            }
        }

    }

}
