package com.stevanivivianlai.vistagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lbl_jmlh_pengikut = findViewById<TextView>(R.id.lbl_jmlh_pengikut)
        val btn_follow = findViewById<Button>(R.id.btn_follow)

        btn_follow.setOnClickListener{
            lbl_jmlh_pengikut.text = "2.576"
            btn_follow.text = "mengikuti"
        }

    }
}