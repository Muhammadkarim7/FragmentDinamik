package com.example.fragmentdinamik

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class BlankFragment : Fragment() {

    private lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_blank, container, false)

        var text = root.findViewById<TextView>(R.id.txt_1)
        var btn = root.findViewById<Button>(R.id.btn_add)
        btn.setOnClickListener {
            text.text = "Hello"
        }

        return root
    }

}