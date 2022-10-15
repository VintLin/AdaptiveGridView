package com.voter.adaptivegridview.bean

import android.os.Parcelable

interface GridItemSize : Parcelable {
    val height: Int
    val width: Int
}