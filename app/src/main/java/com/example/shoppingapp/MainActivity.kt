package com.example.shoppingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shopList = generateDummyList(300)

        recycler_view.adapter = ShopAdapter(shopList)
        recycler_view.layoutManager =LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): List<ShopItem>{
        val list = ArrayList<ShopItem>()

        for (i in 0 until size){
            val drawable = when (i % 3){
                0 -> R.drawable.paris
                1 -> R.drawable.waist
                else -> R.drawable.yellow
            }
            val item = ShopItem(drawable, "Item $i", "Line 2")
            list += item
        }
        return list
    }
}
