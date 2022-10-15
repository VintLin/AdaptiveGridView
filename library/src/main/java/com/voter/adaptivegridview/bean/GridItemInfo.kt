package com.voter.adaptivegridview.bean

import com.voter.adaptivegridview.bean.GridItemSize

class GridItemInfo(private val index: Int, private val item: GridItemSize) {

    fun getSize(): GridItemSize {
        return item
    }

    fun getIndex(): Int {
        return index
    }
}