package com.example.fragment_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.fragment_practice.fragments.FragA
import com.example.fragment_practice.fragments.FragB

class MainActivity : AppCompatActivity(),FragA.communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmanager = supportFragmentManager
    }

    override fun passdata(editTextInput: String) {

        val f :FragB = supportFragmentManager.findFragmentById(R.id.frag2) as FragB
        f.updateDataRecived(editTextInput)
    }
}
