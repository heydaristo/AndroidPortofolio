package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardProfile = findViewById<CardView>(R.id.cardProfile)
        val cardPortofolio = findViewById<CardView>(R.id.cardPortofolio)
        val cardSkill = findViewById<CardView>(R.id.cardSkill)
        val cardHobby = findViewById<CardView>(R.id.cardHobby)
        val cardSchool = findViewById<CardView>(R.id.cardSchool)
        val cardAbout = findViewById<CardView>(R.id.cardAboutMe)

        cardProfile.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)

        }

        cardPortofolio.setOnClickListener{
            val intent = Intent(this, PortofolioActivity::class.java)
            startActivity(intent)
        }
        cardSkill.setOnClickListener{
            Toast.makeText(this, "Tombol SKill", Toast.LENGTH_SHORT).show()
        }
        cardHobby.setOnClickListener{
            Toast.makeText(this, "Tombol Hobby", Toast.LENGTH_SHORT).show()
        }
        cardSchool.setOnClickListener{
            Toast.makeText(this, "Tombol School", Toast.LENGTH_SHORT).show()
        }

        cardAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}