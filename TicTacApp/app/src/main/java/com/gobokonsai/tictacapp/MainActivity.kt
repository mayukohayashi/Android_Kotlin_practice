package com.gobokonsai.tictacapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View) {

        // ユーザーがクリックしたボタンをViewする
        val buttonSelected = view as Button

        // IDがランダムのわけわからんやつやと分かりづらいので変える
        var cellID = 0
        when(buttonSelected.id) {
            R.id.button1 -> cellID = 1
            R.id.button2 -> cellID = 2
            R.id.button3 -> cellID = 3
            R.id.button4 -> cellID = 4
            R.id.button5 -> cellID = 5
            R.id.button6 -> cellID = 6
            R.id.button7 -> cellID = 7
            R.id.button8 -> cellID = 8
            R.id.button9 -> cellID = 9

        }

        // どのボタンが押されたかID表示される
        Log.d("buttonClick", buttonSelected.id.toString())

        // CellID作ったから見る
        Log.d("buttonClick:cellID", cellID.toString())

    }
}