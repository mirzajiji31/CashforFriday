package com.example.mirza.cashforfriday

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    val search =findViewById<Button>(R.id.searchbtn)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        search.setOnClickListener(){

            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}
