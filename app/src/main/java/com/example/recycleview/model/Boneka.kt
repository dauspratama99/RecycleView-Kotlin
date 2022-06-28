package com.example.recycleview.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Boneka(
    var foto: Int = 0,
    var judul: String = "",
    var publish: String = "",
    var tanggal: String = "",
    var isi: String = ""

):Parcelable

