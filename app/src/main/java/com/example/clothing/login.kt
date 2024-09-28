package com.example.clothing


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUpText: TextView = findViewById(R.id.login_sign_up_text)
        signUpText.setOnClickListener {
            // Navigates to the signup activity
            val intent = Intent(this, MainActivity::class.java) // Adjust if needed
            startActivity(intent)
        }



    }
}
