package com.angeo.harrypotter.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by angeooo on 04-Jun-20.
 */


@Parcelize
data class Character(
    val name: String,
    val species: String,
    val gender: String,
    val house: String,
    val dateOfBirth: String,
    val yearOfBirth: String,
    val ancestry: String,
    val patronus: String,
    val actor: String,
    val alive: Boolean,
    val image: String
) : Parcelable