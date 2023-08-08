package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HobbyActivity : AppCompatActivity() {
    lateinit var hobbyView: RecyclerView
    lateinit var hobbyAdapter: HobbyAdapter
    val listHobby = ArrayList<HobbyData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        val btnBack = findViewById<ImageView>(R.id.imgBack)

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        listHobby.add(HobbyData(
            R.drawable.hobby, "Computer", "Suka mencoba hal baru di komputer"
        ))
        listHobby.add(HobbyData(
            R.drawable.game, "Game", "Suka bermain game"
        ))

        hobbyView = findViewById(R.id.rvHobby)
        hobbyView.layoutManager = LinearLayoutManager(this)

        hobbyAdapter = HobbyAdapter(listHobby)
        hobbyAdapter.notifyDataSetChanged()
        hobbyView.adapter = hobbyAdapter

    }
}