package com.example.shoppingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shoplist.view.*

class ShopAdapter(private val shopList: List<ShopItem>) :
    RecyclerView.Adapter<ShopAdapter.ShopViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.shoplist,
            parent, false)

        return ShopViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        val currentItem = shopList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2
    }

    override fun getItemCount() = shopList.size

    class ShopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.image_view
        val textView1: TextView = itemView.text_view_1
        val textView2: TextView = itemView.text_view_2

    }
}