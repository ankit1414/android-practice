package com.example.tast2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var details_tv:TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        details_tv = findViewById(R.id.details)
        fillform.setOnClickListener{
            val intent = Intent(this@MainActivity,FormActivity::class.java)
            startActivityForResult(intent,1)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_CANCELED){
            details_tv.setText("Something went wrong")
        }
        else {
            details_tv.setText(data?.getStringExtra("data"))
        }
    }
}
