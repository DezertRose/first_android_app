package com.example.lr_2

import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

interface OnClearButtonListener {
    fun onClearButtonListener(text: String, type: Typeface, field: TextView)
}

class Fragment_output : Fragment() {
    private lateinit var buttonSec: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_output, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView3)
        buttonSec = view.findViewById(R.id.buttonSec)
    }

    fun deletData(field: TextView){
        buttonSec.setOnClickListener {
            textView.text = ""
            field.text = ""
        }
    }

    fun setData(text: String, type: Typeface){
        if(text.trim().isNotEmpty()){
            textView.typeface = type
            textView.text = text
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            Fragment_output().apply {
                arguments = Bundle().apply {
                }
            }
    }
}