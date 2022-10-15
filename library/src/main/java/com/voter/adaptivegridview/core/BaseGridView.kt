package com.voter.adaptivegridview.core

interface BaseGridView<T : BaseGridAdapter> {
    fun setAdapter(adapter: T)
}