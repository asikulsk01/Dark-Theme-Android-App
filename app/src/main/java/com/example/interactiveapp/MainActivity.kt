package com.example.interactiveapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark= findViewById<Button>(R.id.btnDark)
        val buttonLight= findViewById<Button>(R.id.btnLight)
        val layout= findViewById<LinearLayout>(R.id.linearLayout)

        val mpD= MediaPlayer.create(applicationContext,R.raw.darkmode)
        val mpL= MediaPlayer.create(applicationContext,R.raw.lightmode)

        buttonLight.setOnClickListener {
            //Change the theme to light mode.
            layout.setBackgroundResource(R.color.yellow)
            Toast.makeText(applicationContext,"You have switched to light mode",Toast.LENGTH_SHORT).show()
            mpL.start()
        }
        buttonDark.setOnClickListener {
            //Change the theme to dark mode.
            layout.setBackgroundResource(R.color.black)
            Toast.makeText(applicationContext,"You have switched to dark mode",Toast.LENGTH_SHORT).show()
            mpD.start()
        }
    }
}