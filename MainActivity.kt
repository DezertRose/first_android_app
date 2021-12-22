package com.example.lr_2

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity(), OnClearButtonListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClearButtonListener( text: String, type: Typeface, field: TextView) {
        val fragmentManager = supportFragmentManager
        val fragmentOut = fragmentManager.findFragmentById(R.id.fragment_output) as Fragment_output?
        fragmentOut?.setData(text, type)
        fragmentOut?.deletData(field)
    }
}