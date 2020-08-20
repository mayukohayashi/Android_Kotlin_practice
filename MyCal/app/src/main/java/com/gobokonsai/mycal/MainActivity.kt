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

        //もしこれから行う計算が新たなもの（数字をいれたい）で場合、画面は空の状態でなければならない
        if (isNewOperation){
            editTextShowNumber.setText("")
        }

        // 数字を入力したいので、falseに変えろ
        isNewOperation = false

        // 選ばれたボタンはどれか
        val buttonSelected = view as Button

        // クリックされたボタンの値をStringとしてもたせる。最初に見える上部テキストデフォルト設定
        var buttonClickedValue:String = editTextShowNumber.text.toString()

        //
        when (buttonSelected.id) {
            bt0.id -> {
                // TODO: 最初につかない、その後.が付く場合はOK
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
                // TODO: 小数点は１個だけしか使えないようにして
                buttonClickedValue += "."
            }
            btPlusMins.id -> {
                // TODO: -が量産されるのやめて
                buttonClickedValue = "-$buttonClickedValue"
            }
        }

        editTextShowNumber.setText(buttonClickedValue)
    }

    // 何の計算をするか変数をつくる
    var op = "*"

    // 入力されていた数字を保持
    var oldNumber = ""

    // 計算できる状態か
    var isNewOperation = true

    fun btOpEvent (view: View) {

        val buttonSelected = view as Button

        when (buttonSelected.id) {
            btMul.id -> {

                op = "*"
            }
            btDiv.id -> {

                op = "/"
            }
            btSub.id -> {

                op = "-"
            }
            btSum.id -> {

                op = "+"
            }
        }

        oldNumber = editTextShowNumber.text.toString()

        //次の計算を行うためTrueに
        isNewOperation = true

    }

    fun btEqualEvent(view: View) {
        var newNumber = editTextShowNumber.text.toString()
        var resultNumber:Float? = null

        when(op) {
            "*" -> {
                resultNumber = oldNumber.toFloat() * newNumber.toFloat()
            }
            "/" -> {
                resultNumber = oldNumber.toFloat() / newNumber.toFloat()
            }
            "-" -> {
                resultNumber = oldNumber.toFloat() - newNumber.toFloat()
            }
            "+" -> {
                resultNumber = oldNumber.toFloat() + newNumber.toFloat()
            }
        }
        editTextShowNumber.setText(resultNumber.toString())
        isNewOperation = true
    }

    fun btPercentEvent(view: View) {
        var showedNumber:Float = editTextShowNumber.text.toString().toFloat() / 100
        editTextShowNumber.setText(showedNumber.toString())
    }
}