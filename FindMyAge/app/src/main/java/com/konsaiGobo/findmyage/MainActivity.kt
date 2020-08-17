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

            val userDataOfBirth = Integer.parseInt(txtDataOfBirth.text.toString())
                // txtDataOfBirthの中のテキストをStringにしたものをIntegerに。

            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
                // 今年をカレンダーから持ってくる

            val userAge = currentYear - userDataOfBirth
                // 現在のYearからユーザーの誕生年を引いて、年齢を出す

        }
    }
}