package com.example.sopt_0425.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_0425.R

class HomeAdapter(private val context : Context) : RecyclerView.Adapter<HomeViewHolder>(){
    var datas : MutableList<HomeData> = mutableListOf<HomeData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.homeitem_insta, parent, false)
        return HomeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(datas[position])
    }
}