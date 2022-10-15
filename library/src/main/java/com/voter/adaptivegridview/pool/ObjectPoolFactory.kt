package com.voter.adaptivegridview.pool

interface ObjectPoolFactory<T> {
    fun createObject(): T
}