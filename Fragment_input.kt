package com.example.lr_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class Fragment_input : Fragment() {
    private lateinit var editText: TextView
    private lateinit var button: Button
    private lateinit var temp_RBut: RadioButton
    private lateinit var group_RBut: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        editText = view.findViewById(R.id.inpText)
        button = view.findViewById(R.id.button)
        group_RBut = view.findViewById(R.id.radioGroup)

        super.onViewCreated(view, savedInstanceState)
        var string: String

        button.setOnClickListener {
            val checked = group_RBut.checkedRadioButtonId
            temp_RBut = view.findViewById(checked)
            string = editText.text.toString()

            if(string.trim().isEmpty()){
                Toast.makeText(requireActivity(), "Text field is empty!", Toast.LENGTH_SHORT).show()
            }
            else{
                val listener = activity as OnClearButtonListener?
                listener?.onClearButtonListener(string,temp_RBut.typeface, editText)
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            Fragment_input().apply {
                arguments = Bundle().apply {
                }
            }
    }
}