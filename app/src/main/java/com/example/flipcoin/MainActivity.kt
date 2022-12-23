package com.example.flipcoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button :Button =findViewById(R.id.button)
        val textView:TextView =findViewById(R.id.textView)

        button.setOnClickListener {
            val ans = (1..2).random()


            Toast.makeText(this, "TOSSED", Toast.LENGTH_SHORT).show()
            if(ans == 1)
            {
                textView.text="HEADS !!"
            }
            else
            {
                textView.text="TAILS !!"
            }

        }
    }
}