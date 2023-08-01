package com.example.project

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PortofolioAdapter(private val list: ArrayList<PortofolioData>):
 RecyclerView.Adapter<PortofolioAdapter.PortofolioViewHolder>() {
    class PortofolioViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val logo = itemView.findViewById<ImageView>(R.id.logoPortofolio)
        private val judul = itemView.findViewById<TextView>(R.id.judulPortofolio)
        private val decs = itemView.findViewById<TextView>(R.id.deskripsiPortofolio)

        fun bind(get: PortofolioData) {
            logo.setImageResource(get.logo)
            judul.text = get.judul
            decs.text = get.deskripsi

            judul.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(get.url))
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PortofolioViewHolder {
        return PortofolioViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.portofolio_list, parent, false))
    }

    override fun onBindViewHolder(holder: PortofolioViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}