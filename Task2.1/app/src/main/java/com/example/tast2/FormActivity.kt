package com.example.tast2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        var data:String  = ""
        submit.setOnClickListener {
            if(name_ed.text.toString().isEmpty()){
                name_ed.setError("field can't be empty!")
                return@setOnClickListener
            }
            if(email_ed.text.toString().isEmpty()){
                email_ed.setError("field can't be empty!")
                return@setOnClickListener
            }
            if(mobile_ed.text.toString().isEmpty()){
                mobile_ed.setError("field can't be empty!")
                return@setOnClickListener
            }
            data += "Name : " + name_ed.text.toString()
            data += "\nemail : " + email_ed.text.toString()
            data += "\nmobile : " + mobile_ed.text.toString()
            val returnIntent = Intent(this , MainActivity::class.java)
            returnIntent.putExtra("data",data);
            setResult(1,returnIntent)
            finish()
        }

    }
}
