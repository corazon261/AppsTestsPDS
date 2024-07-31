package com.example.projectapplucas1507

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CertificateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_certificate)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun linkToDrive(view: View){
        val urlToDrive= "https://drive.google.com/drive/folders/12Or5vboZSW6DwSeaSe3NbJPhecIXjxd0?usp=sharing"
        val i = Intent(Intent.ACTION_VIEW)
        i.data= Uri.parse(urlToDrive)
        startActivity(i)
    }
}