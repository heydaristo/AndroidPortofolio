package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SkillsActivity : AppCompatActivity() {
    lateinit var skillView: RecyclerView
    lateinit var skillsAdapter: SkillsAdapter
    val listSkills = ArrayList<SkillsData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        val btnBack = findViewById<ImageView>(R.id.imgBack)

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        listSkills.add(SkillsData(
            R.drawable.web, "HTML & CSS"
        ))
        listSkills.add(SkillsData(
            R.drawable.web, "Javascript"
        ))
        listSkills.add(SkillsData(
            R.drawable.web, "PHP Framework"
        ))
        listSkills.add(SkillsData(
            R.drawable.web, "Kotlin"
        ))

        skillView = findViewById(R.id.rvSkills)
        skillView.layoutManager = LinearLayoutManager(this)

        skillsAdapter = SkillsAdapter(listSkills)
        skillsAdapter.notifyDataSetChanged()
        skillView.adapter = skillsAdapter
    }
}