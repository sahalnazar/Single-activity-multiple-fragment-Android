package io.github.sahalnazar.activitiestofragments.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Data (
    val id: Int? = null,
    val value: String? = null
): Parcelable