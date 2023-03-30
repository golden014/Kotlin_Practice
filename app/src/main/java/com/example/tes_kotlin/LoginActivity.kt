package com.example.tes_kotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tes_kotlin.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginBt = findViewById<Button>(R.id.button_login)
        val loginTxt = findViewById<TextView>(R.id.login_text)

        loginBt.setOnClickListener() {
            loginTxt.setText(R.string.login_button_clicked_text)
        }
    }
}