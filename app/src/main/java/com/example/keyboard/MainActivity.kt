package com.example.keyboard

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowKeyboard.setOnClickListener(this)
        btnHideKeyboard.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnShowKeyboard -> showKeyboard()
            R.id.btnHideKeyboard -> hideKeyboard()
        }
    }

    private fun showKeyboard() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        editTextTextPersonName.requestFocus()
        imm.showSoftInput(editTextTextPersonName, 0)
    }

    private fun hideKeyboard() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(editTextTextPersonName!!.windowToken, 0)
    }
}