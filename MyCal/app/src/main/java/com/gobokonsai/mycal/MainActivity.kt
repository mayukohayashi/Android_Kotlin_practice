package com.gobokonsai.mycal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.abs

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

        // マイナスプリント最初はされないです
        var isMinusPrinted = false

        // 数字を入力したいので、falseに変えろ
        isNewOperation = false

        // 選ばれたボタンはどれか
        val buttonSelected = view as Button

        // クリックされたボタンの値をStringとしてもたせる。最初に見える上部テキストデフォルト設定
        var buttonClickedValue:String = editTextShowNumber.text.toString()

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
                buttonClickedValue += "."

                // isClickableとかいう便利なやつを使って、一回押したらもう押せないようにするよ
                btDot.isClickable = false
            }

            btPlusMins.id -> {
                // -のついていないabsolute値を出す。数字
                val resultWithoutMinus = abs(buttonClickedValue.toInt()) // Math.absがJavaの書き方っぽい

                if (!isMinusPrinted){

                    buttonClickedValue = "-$resultWithoutMinus" // - 123とかなれる
                    isMinusPrinted = true // trueにして　-がプリントされてる状態だよと示す
                } else {

                    buttonClickedValue = resultWithoutMinus.toString() // 123だけの状態
                    isMinusPrinted = false
                }
            }
        }

        editTextShowNumber.setText(buttonClickedValue)
    }

    // 何の計算をするか変数をつくる
    var op = "*"

    // 入力されていた数字を保持
    var oldValue = ""

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

        oldValue = editTextShowNumber.text.toString()

        //次の計算を行うためTrueに
        isNewOperation = true

    }

    fun btEqualEvent(view: View) {
        var newValue = editTextShowNumber.text.toString()
        var resultValue:Float? = null

        when(op) {
            "*" -> {
                resultValue = oldValue.toFloat() * newValue.toFloat()
            }
            "/" -> {
                resultValue = oldValue.toFloat() / newValue.toFloat()
            }
            "-" -> {
                resultValue = oldValue.toFloat() - newValue.toFloat()
            }
            "+" -> {
                resultValue = oldValue.toFloat() + newValue.toFloat()
            }
        }
        editTextShowNumber.setText(resultValue.toString())
        isNewOperation = true
    }

    fun btPercentEvent(view: View) {
        val showedNumber:Float = editTextShowNumber.text.toString().toFloat() / 100
        editTextShowNumber.setText(showedNumber.toString())
        isNewOperation = true
    }

    fun btClearEvent(view: View) {
        editTextShowNumber.setText("0")

        isNewOperation = true

        // dotも押せるようする
        btDot.isClickable = true
    }
}