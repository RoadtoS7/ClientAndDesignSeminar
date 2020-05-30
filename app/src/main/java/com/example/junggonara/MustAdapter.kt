package com.example.junggonara

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tistory.comfy91.clientanddesignseminar.R

class MustAdapter(private val context : Context) : RecyclerView.Adapter<MustViewHolder>() {
    var datas1 = listOf<MustData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MustViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_must, parent, false)
        return MustViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas1.size
    }

    override fun onBindViewHolder(holder: MustViewHolder, position: Int) {
        holder.bind(datas1[position])
    }

}