package com.example.projectapplucas1507

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_project)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun View.linkToGit() {
        val urlToGit = "https://github.com/corazon261"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(urlToGit)
        startActivity(i)
    }
    fun View.linkToInsta() {
        val urlToInsta = "https://www.instagram.com/_terasstudio__?utm_source=ig_web_button_share_sheet&igsh=ZDNlZDc0MzIxNw=="
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(urlToInsta)
        startActivity(i)
    }
    fun View.linkToLinkedln(){
        val urlToLinke = "https://www.linkedin.com/in/lucas-weber-108573257/"
        val i = Intent(Intent.ACTION_VIEW)
        i.data= Uri.parse(urlToLinke)
        startActivity(i)
    }
}