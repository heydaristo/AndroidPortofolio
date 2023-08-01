package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PortofolioActivity : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    val listPortofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)
        listPortofolio.add(PortofolioData(
            R.drawable.web, "E-Voting", "Website untuk pemilihan Ketua osis dan Wakil Ketua Osis.", "https://github.com/heydaristo/EVOTING"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.web, "BukuTamu", "Website untuk mendata tamu yang datang pada saat Gelar Karya.", "https://github.com/heydaristo/BukuTamu"
        ))

        listPortofolio.add(PortofolioData(
            R.drawable.web, "TeacherProfileApp", "Aplikasi untuk menampilkan biodata seorang guru", "https://github.com/heydaristo/TeacherProfileApp"
        ))

        portofolioView = findViewById(R.id.rvPortofolio)
        portofolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = PortofolioAdapter(listPortofolio)
        portofolioAdapter.notifyDataSetChanged()
        portofolioView.adapter = portofolioAdapter
    }
}