package com.example.project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HobbyAdapter(private val list: ArrayList<HobbyData>):
    RecyclerView.Adapter<HobbyAdapter.HobbyViewHolder>() {
    class HobbyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.judulHobby)
        private val decs = itemView.findViewById<TextView>(R.id.deskripsiHobby)

        fun bind(get: HobbyData) {
            nama.text = get.nama
            decs.text = get.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyViewHolder {
        return HobbyViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.hobby_list, parent, false))
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}