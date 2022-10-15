package com.voter.adaptivegridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.main.view.HomeFragment
import com.voter.adaptivegridview.impl.GridRecyclerView
import com.voter.adaptivegridview.view.bean.DemoUtils
import com.voter.adaptivegridview.view.item.ItemViewAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridView = findViewById<GridRecyclerView>(R.id.recyclerView)
        gridView?.apply {
            val adapter = ItemViewAdapter(DemoUtils().randomItems(50))
            setAdapter(adapter)
        }
    }
}