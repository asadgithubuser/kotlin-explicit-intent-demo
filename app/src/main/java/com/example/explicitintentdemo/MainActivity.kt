package com.example.explicitintentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object{
        val MY_MESSAGE = "com.example.explicitintentdemo.MY_MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val msgField:EditText = findViewById<EditText>(R.id.message)
        (findViewById<Button>(R.id.btn)).setOnClickListener{
            val changeIntent = Intent(this, ShowMessageActivity::class.java)
            val message = msgField.text.toString()
            changeIntent.putExtra(MY_MESSAGE, message)
            startActivity(changeIntent)

            msgField.setText("")
        }
    }
}
