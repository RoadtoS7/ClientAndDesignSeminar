package com.example.junggonara

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tistory.comfy91.clientanddesignseminar.R

class MustViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val product_image = itemView.findViewById<ImageView>(R.id.product_image)
    val cer_mini = itemView.findViewById<ImageView>(R.id.cer_mini)
    val new_mini = itemView.findViewById<ImageView>(R.id.new_mini)
    val product_name = itemView.findViewById<TextView>(R.id.product_name)
    val price = itemView.findViewById<TextView>(R.id.price)

    @SuppressLint("CheckResult")
    fun bind(mustData: MustData) {
        Glide.with(itemView).load(mustData.product_image)
        Glide.with(itemView).load(mustData.cer_mini)
        Glide.with(itemView).load(mustData.new_mini)
        product_name.text = mustData.product_name
        price.text = mustData.price


    }
}