package com.example.junggonara


import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tistory.comfy91.clientanddesignseminar.R
import kotlinx.android.synthetic.main.item_best.view.*

class BestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val image_best = itemView.findViewById<ImageView>(R.id.image_best)
    val text_user = itemView.findViewById<TextView>(R.id.text_user)
    val level = itemView.findViewById<TextView>(R.id.level)
    val medal = itemView.findViewById<ImageView>(R.id.medal)

//    @SuppressLint("CheckResult")
    fun bind (bestData : BestData) {
//        Glide.with(itemView).load(bestData.image_best)
        text_user.text = bestData.userName
        level.text = bestData.textLevel
//        Glide.with(itemView).load(bestData.medal)

        image_best.setImageResource(bestData.image_best)
        medal.setImageResource(bestData.medal)
    }
}