package com.example.junggonara

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tistory.comfy91.clientanddesignseminar.R

class BestAdapter(private val context : Context) : RecyclerView.Adapter<BestViewHolder>() {
    var datas = listOf<BestData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_best, parent, false)
        return BestViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: BestViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}