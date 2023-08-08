package com.example.project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SkillsAdapter(private val list: ArrayList<SkillsData>):
    RecyclerView.Adapter<SkillsAdapter.SkillsViewHolder>() {
class SkillsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val nama = itemView.findViewById<TextView>(R.id.nama)

    fun bind(get: SkillsData) {
        nama.text = get.nama
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillsViewHolder {
        return SkillsViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.skills_list, parent, false))
    }

    override fun onBindViewHolder(holder: SkillsViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
