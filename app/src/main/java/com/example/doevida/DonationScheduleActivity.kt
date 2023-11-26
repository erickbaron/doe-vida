package com.example.doevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DonationScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donation_schedule)

        findViewById<Button>(R.id.button).setOnClickListener{
            val i = intent
            val j = Intent(this, MainActivity::class.java)
            j.putExtras(i)
            startActivity(j)
        }
    }
}