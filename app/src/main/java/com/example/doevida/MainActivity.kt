package com.example.doevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val i = intent
            val j = Intent(this, DonationScheduleActivity::class.java)
            j.putExtras(i)
            startActivity(j)
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val i = intent
            val j = Intent(this, DonationRequiredActivity::class.java)
            j.putExtras(i)
            startActivity(j)
        }

        findViewById<Button>(R.id.button3).setOnClickListener{
            val i = intent
            val j = Intent(this, ProfileActivity::class.java)
            j.putExtras(i)
            startActivity(j)
        }

        findViewById<Button>(R.id.button4).setOnClickListener{
            val i = intent
            val j = Intent(this, InfoActivity::class.java)
            j.putExtras(i)
            startActivity(j)
        }
    }
}