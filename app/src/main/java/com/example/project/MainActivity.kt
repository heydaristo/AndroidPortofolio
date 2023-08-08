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
            finish()
        }

        cardPortofolio.setOnClickListener{
            val intent = Intent(this, PortofolioActivity::class.java)
            startActivity(intent)
            finish()
        }
        cardSkill.setOnClickListener{
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
            finish()
        }
        cardHobby.setOnClickListener{
            val intent = Intent(this, HobbyActivity::class.java)
            startActivity(intent)
            finish()
        }
        cardSchool.setOnClickListener{
            val intent = Intent(this, SchoolActivity::class.java)
            startActivity(intent)
            finish()
        }

        cardAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}