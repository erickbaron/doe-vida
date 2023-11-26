package com.example.doevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        findViewById<Button>(R.id.button).setOnClickListener{
            val i = intent
            val j = Intent(this, MainActivity::class.java)
            j.putExtras(i)
            startActivity(j)
        }
    }
}