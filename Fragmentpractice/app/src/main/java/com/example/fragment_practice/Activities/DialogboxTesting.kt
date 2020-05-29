package com.example.fragment_practice.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.fragment_practice.R
import kotlinx.android.synthetic.main.activity_dialogbox_testing.*
import kotlinx.android.synthetic.main.custom_dialog.view.*

class DialogboxTesting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogbox_testing)

        Toast.makeText(this,localClassName+" : oncreate",Toast.LENGTH_SHORT).show()
        open_dialog_btn.setOnClickListener {
            createDialogbox()
        }
    }
    private fun createDialogbox(){
        val builder : AlertDialog.Builder = AlertDialog.Builder(this)
        val view : View = LayoutInflater.from(this).inflate(R.layout.custom_dialog, null)
        val alertDialog = builder.create()
        alertDialog.setView(view)
        alertDialog.show()
        view.submit_btn.setOnClickListener {
            textView.text = view.text_ed.editText?.text.toString()
            alertDialog.dismiss()
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,localClassName+" : onstart",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,localClassName+" : onpause",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,localClassName+" : onRestart",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,localClassName+" : onstop",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,localClassName+" : onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this,localClassName+" : onDestroy",Toast.LENGTH_SHORT).show()
    }
}
