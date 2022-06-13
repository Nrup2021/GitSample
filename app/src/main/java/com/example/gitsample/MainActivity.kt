package com.example.gitsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("In Experimental branch")

        println("Youtube branch")
        println("Very first commit")
        println("Second commit")
    }
}