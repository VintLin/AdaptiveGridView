package com.voter.adaptivegridview.bean

import android.view.View

interface GirdViewAction {
    fun onItemClick(index: Int, view: View)

    fun onItemLongClick(index: Int, view: View): Boolean
}