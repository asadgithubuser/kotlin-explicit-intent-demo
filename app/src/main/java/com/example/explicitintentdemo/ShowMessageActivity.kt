package com.example.explicitintentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.explicitintentdemo.MainActivity.Companion.MY_MESSAGE

class ShowMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)

        val catchMessage = intent.getStringExtra(MY_MESSAGE)

        (findViewById<TextView>(R.id.showMessage)).setText(catchMessage)

    }
}
