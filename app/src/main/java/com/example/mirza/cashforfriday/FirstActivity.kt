package com.example.mirza.cashforfriday

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {

    val signinButton =findViewById<Button>(R.id.signupbtn)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        signinButton.setOnClickListener(){

            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

}
