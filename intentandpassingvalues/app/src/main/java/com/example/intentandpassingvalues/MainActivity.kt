package com.example.intentandpassingvalues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var textInputEditText : TextInputEditText;
    lateinit var submit_btn : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,localClassName+": oncreate",Toast.LENGTH_SHORT).show()
        textInputEditText = findViewById(R.id.textInputEditText)
        val st = textInputEditText.text;
        submit_btn = findViewById(R.id.button);
        submit_btn.setOnClickListener {
            val intent = Intent(this@MainActivity,Display::class.java)
            intent.putExtra("edit_text_val",st)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,localClassName+": onStart",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,localClassName+": onPause",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,localClassName+": onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,localClassName+": onStop",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,localClassName+": onDestroy",Toast.LENGTH_SHORT).show()
    }

}
