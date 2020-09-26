package com.proguru.android.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.proguru.android.Constants.Companion.DATA
import com.proguru.android.R
import com.proguru.android.ui.login.LoginActivity
import com.proguru.android.ui.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            Intent(this, LoginActivity::class.java).apply {
                putExtra(DATA, getString(R.string.login))
            }.run {
                startActivity(this)
            }
        }

        btnRegister.setOnClickListener {
            Intent(this, RegisterActivity::class.java).apply {
                putExtra(DATA, getString(R.string.register))
            }.run {
                startActivity(this)
            }
        }

    }
}