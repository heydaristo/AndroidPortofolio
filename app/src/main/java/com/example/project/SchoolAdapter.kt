package com.example.project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class SchoolAdapter (private val list: ArrayList<SchoolData>):
    RecyclerView.Adapter<SchoolAdapter.SchoolViewHolder>() {
        class SchoolViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            private val logo = itemView.findViewById<ImageView>(R.id.logoSchool)
            private val nama = itemView.findViewById<TextView>(R.id.judulSchool)
    private val alamat = itemView.findViewById<TextView>(R.id.deskripsiSchool)

    fun bind(get: SchoolData) {
        logo.setImageResource(get.logo)
        nama.text = get.nama
        alamat.text = get.alamat
         }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolViewHolder {
        return SchoolViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.school_list, parent, false))
    }

    override fun onBindViewHolder(holder: SchoolViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
