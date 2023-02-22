package com.example.onfocus

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var editText: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editText)
        editText.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                // If the EditText has focus, change the text color to black
//                editText.setHintTextColor(Color.BLACK)
            } else {
                // If the EditText loses focus, change the text color to red
                editText.setHintTextColor(Color.RED)
                editText.hint = "*This field is required*"
            }
        }
    }
}