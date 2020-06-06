package com.angeo.harrypotter.ui



import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import com.angeo.harrypotter.R

/**
 * Created by angeooo on 04-Jun-20.
 */


enum class HouseType(@DrawableRes val logo: Int, @ColorRes val color: Int) {
    Gryffindor(R.drawable.gryffindor_icon, R.color.reddark),
    Slytherin(R.drawable.slytherin_icon, R.color.greendark),
    Ravenclaw(R.drawable.ravenclaw_icon, R.color.bluedark),
    Hufflepuff(R.drawable.huflepuff_icon, R.color.yellowdark)
}