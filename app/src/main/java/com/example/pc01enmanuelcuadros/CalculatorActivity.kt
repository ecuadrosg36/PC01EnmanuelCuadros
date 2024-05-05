package com.example.pc01enmanuelcuadros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    private lateinit var etOperand1: EditText
    private lateinit var etOperand2: EditText
    private lateinit var tvResult: TextView
    private lateinit var btnCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        etOperand1 = findViewById(R.id.et_operand1)
        etOperand2 = findViewById(R.id.et_operand2)
        tvResult = findViewById(R.id.tv_result)
        btnCalculate = findViewById(R.id.btn_calculate)

        btnCalculate.setOnClickListener {
            val operand1 = etOperand1.text.toString().toDoubleOrNull()
            val operand2 = etOperand2.text.toString().toDoubleOrNull()

            if (operand1 != null && operand2 != null) {
                val result = when (findViewById<Button>(R.id.btn_operator).text.toString()) {
                    "+" -> operand1 + operand2
                    "-" -> operand1 - operand2
                    "*" -> operand1 * operand2
                    "/" -> operand1 / operand2
                    else -> 0.0
                }

                tvResult.text = "Result: $result"
            } else {
                tvResult.text = "Error: Please enter valid numbers"
            }
        }
    }
}