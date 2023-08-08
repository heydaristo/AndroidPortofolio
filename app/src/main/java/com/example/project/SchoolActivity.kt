package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SchoolActivity : AppCompatActivity() {
    lateinit var schoolView: RecyclerView
    lateinit var schoolAdapter: SchoolAdapter
    val listSchool = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_school)

        val btnBack = findViewById<ImageView>(R.id.imgBack)

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        listSchool.add(SchoolData(
            R.drawable.school, "SDN Tlogosari Kulon 02", "Jl. Puskesmas No 7, TLOGOSARI KULON, Kec. Pedurungan, Kota Semarang Prov. Jawa Tengah"
        ))
        listSchool.add(SchoolData(
            R.drawable.school, "SMPN 34 SEMARANG", "Jl. Tlogomulyo, Tlogomulyo, Kec. Pedurungan, Kota Semarang, Jawa Tengah 50113"
        ))
        listSchool.add(SchoolData(
            R.drawable.school, "SMKN 1 SAYUNG", "Jl Raya Semarang Demak Km 14 Onggorawe Sayung Demak, Daleman, Tugu, Kec. Sayung, Kabupaten Demak, Jawa Tengah 59563"
        ))

        schoolView = findViewById(R.id.rvSchool)
        schoolView.layoutManager = LinearLayoutManager(this)

        schoolAdapter = SchoolAdapter(listSchool)
        schoolAdapter.notifyDataSetChanged()
        schoolView.adapter = schoolAdapter
    }
}