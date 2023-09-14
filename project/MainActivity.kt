package com.firstapp.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonDark= findViewById<Button>(R.id.btnDark)

        buttonDark.setOnClickListener {
            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)

        }
 val buttonLight=findViewById<Button>(R.id.btnLight)
        buttonLight.setOnClickListener{
            intent= Intent( applicationContext,MainActivity3::class.java)
            startActivity(intent)
        }


    }
}