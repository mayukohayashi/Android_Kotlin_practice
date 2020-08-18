package com.gobokonsai.mycal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btNumberEvent(view: View) {

        // 選ばれたボタンはどれか
        val buttonSelected = view as Button

        // クリックされたボタンの値をStringとしてもたせる。最初に見える上部テキストデフォルト設定
        var buttonClickedValue:String = editTextShowNumber.text.toString()

        //
        when (buttonSelected.id) {
            bt0.id -> {
                buttonClickedValue += "0"
            }
            bt1.id -> {
                buttonClickedValue += "1"
            }
            bt2.id -> {
                buttonClickedValue += "2"
            }
            bt3.id -> {
                buttonClickedValue += "3"
            }
            bt4.id -> {
                buttonClickedValue += "4"
            }
            bt5.id -> {
                buttonClickedValue += "5"
            }
            bt6.id -> {
                buttonClickedValue += "6"
            }
            bt7.id -> {
                buttonClickedValue += "7"
            }
            bt8.id -> {
                buttonClickedValue += "8"
            }
            bt9.id -> {
                buttonClickedValue += "9"
            }
            btDot.id -> {
                // TODO: 小数点は１個だけしか使えないようにする
                buttonClickedValue += "."
            }
            btPlusMins.id -> {
                buttonClickedValue = "-$buttonClickedValue"
            }
        }

        editTextShowNumber.setText(buttonClickedValue)
    }
}