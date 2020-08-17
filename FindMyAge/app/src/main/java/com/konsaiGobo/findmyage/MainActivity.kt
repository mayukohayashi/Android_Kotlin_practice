package com.konsaiGobo.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btGetAge.setOnClickListener {

            // ここにボタンをクリックしたときに走るCode

            val userDataOfTheBirth = txtDataOfBirth.text.toString()
                // txtDataOfBirthの中のテキストをStringにしたもの
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
                // 今年をカレンダーから持ってくる

        }
    }
}