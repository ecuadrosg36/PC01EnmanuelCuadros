package com.example.pc01enmanuelcuadros

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openCalculator(view: View) {
        val intent = Intent(this, CalculatorActivity::class.java)
        startActivity(intent)
    }
}