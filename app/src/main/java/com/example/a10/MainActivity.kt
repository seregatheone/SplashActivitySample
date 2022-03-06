package com.example.a10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.a10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textButton1 = findViewById<EditText>(R.id.editText)
        val textButton2 = findViewById<EditText>(R.id.editText1)
        val textButton3 = findViewById<EditText>(R.id.editText2)
        val textButton4 = findViewById<EditText>(R.id.editText3)
        val textButton5 = findViewById<EditText>(R.id.editText4)
        button.setOnClickListener {
            val intent = Intent(this,InfoActivity::class.java)
            intent.putExtra("name",textButton1.text.toString())
            intent.putExtra("surname",textButton2.text.toString())
            intent.putExtra("pat",textButton3.text.toString())
            intent.putExtra("age",textButton4.text.toString())
            intent.putExtra("hobby",textButton5.text.toString())
            startActivity(intent)
        }

    }
}