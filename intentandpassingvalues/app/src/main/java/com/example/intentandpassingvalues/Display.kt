package com.example.intentandpassingvalues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display.*

class Display : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        var text = intent.extras?.get("edit_text_val").toString()
        textView.text = text
    }
}
