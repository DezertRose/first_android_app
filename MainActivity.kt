package com.example.lr_1_ver_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    private lateinit var editText: TextView
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var buttonSec: Button
    private lateinit var temp_RBut: RadioButton
    private lateinit var group_RBut: RadioGroup



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.inpText)
        textView = findViewById(R.id.textView3)
        button = findViewById(R.id.button)
        button = findViewById(R.id.button)
        group_RBut = findViewById(R.id.radioGroup)

    }

    fun onOk(view: View){
        var string: String
        button.setOnClickListener {
            val checked = group_RBut.checkedRadioButtonId
            temp_RBut = findViewById(checked)
            string = editText.text.toString()
            if(string.trim().isNotEmpty()){
                textView.typeface = temp_RBut.typeface
                textView.text = string
            }
            else{
                Toast.makeText(this, "Text field is empty!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun onCancel(view: View){
        buttonSec.setOnClickListener {
            textView.text = ""
            editText.text = ""
        }
    }
}