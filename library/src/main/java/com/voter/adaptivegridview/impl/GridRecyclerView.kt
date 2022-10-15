package com.voter.adaptivegridview.impl

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.ViewTreeObserver.OnGlobalLayoutListener
import android.widget.LinearLayout
import com.voter.adaptivegridview.core.BaseGridView
import com.voter.adaptivegridview.pool.LinearLayoutObjectPoolFactory
import com.voter.adaptivegridview.pool.ObjectPoolFactory

class GridRecyclerView(context: Context, attrs: AttributeSet?) : RecyclerView(context, attrs), BaseGridView<GridRecyclerViewAdapter> {
    private var adapter: GridRecyclerViewAdapter? = null
    private var isInit: Boolean = false

    override fun setAdapter(adapter: GridRecyclerViewAdapter) {
        this.adapter = adapter
        super.setAdapter(adapter)
        if (!isInit) {
            isInit = true
            val isHorizontal = adapter.requestGirdViewConfig().isHorizontal
            val layoutManager = LinearLayoutManager(context, if (isHorizontal) LinearLayoutManager.HORIZONTAL else LinearLayoutManager.VERTICAL, false)
            this.layoutManager = layoutManager
            addItemDecoration(SpacesItemDecoration(adapter.requestGirdViewConfig().spaceWidth, isHorizontal))
        }
        this.adapter?.setPoolFactory(LinearLayoutObjectPoolFactory(context) as ObjectPoolFactory<LinearLayout>)
        this.adapter?.recalculateData()
    }

    init {
        clipToPadding = false
        clipChildren = false
        viewTreeObserver?.addOnGlobalLayoutListener(object : OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                viewTreeObserver.removeGlobalOnLayoutListener(this)
                adapter?.recalculateData()
            }
        })
    }
}