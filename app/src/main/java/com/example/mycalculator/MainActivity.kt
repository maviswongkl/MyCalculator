package com.example.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var last = false
    var add = false
    var subtract = false
    var multiply = false
    var divide = false
    var calculate = 0.0;
    var operation = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        var tvNum = tvResults.text.toString()
        val btnSelected = view as Button
        when (btnSelected.id) {
            buttonClear.id -> {
                tvResults.text = "0"
                calculate = 0.0
            }
            button1.id -> {
                if (tvNum.equals("0") || last) {
                    tvResults.text = "1"
                    last = false
                } else {
                    tvResults.text = tvNum + "1"
                    add = false
                    subtract = false
                }
            }
            button2.id -> {
                if (tvNum.equals("0") || last) {
                    tvResults.text = "2"
                    last = false
                } else {
                    tvResults.text = tvNum + "2"
                }
            }
            button3.id -> {
                if (tvNum.equals("0") || last) {
                    tvResults.text = "3"
                    last = false
                } else {
                    tvResults.text = tvNum + "3"
                }
            }
            button4.id -> {
                if (tvNum.equals("0") || last) {
                    tvResults.text = "4"
                    last = false
                } else {
                    tvResults.text = tvNum + "4"
                }
            }
            button5.id -> {
                if (tvNum.equals("0") || last) {
                    tvResults.text = "5"
                    last = false
                } else {
                    tvResults.text = tvNum + "5"
                }
            }
            button6.id -> {
                if (tvNum.equals("0") || last) {
                    tvResults.text = "6"
                    last = false
                } else {
                    tvResults.text = tvNum + "6"
                }
            }
            button7.id -> {
                if (tvNum.equals("0") || last) {
                    tvResults.text = "7"
                    last = false
                } else {
                    tvResults.text = tvNum + "7"
                }
            }
            button8.id -> {
                if (tvNum.equals("0") || last) {
                    tvResults.text = "8"
                    last = false
                } else {
                    tvResults.text = tvNum + "8"
                }
            }
            button9.id -> {
                if (tvNum.equals("0") || last) {
                    tvResults.text = "9"
                    last = false
                } else {
                    tvResults.text = tvNum + "9"
                }
            }
            button0.id -> {
                if (tvNum.equals("0") || last) {
                    tvResults.text = "0"
                    last = false
                } else {
                    tvResults.text = tvNum + "0"
                }
            }
            buttonDeci.id -> {
                if (tvResults.text.toString().contains(".")) {

                } else {
                    if (tvNum.equals("0") || last) {
                        tvResults.text = "0."
                        last = false
                    } else if (!last) {
                        tvResults.text = tvNum + "."
                    }
                }
            }
        }
    }

    fun buttonOperationOnClick(view: View) {
        var tvResult = tvResults.text.toString()
        val btnSelected = view as Button
        when (btnSelected.id) {
            buttonAdd.id -> {
                if (operation.equals("")) {
                    calculate = tvResult.toDouble()
                    operation = "+"
                    last = true
                    add = true
                } else {
                    calculate += tvResult.toDouble()
                    operation = "+"
                    last = true
                    add = true
                }
            }
            buttonSubtract.id -> {
                if (operation.equals("")) {
                    calculate = tvResult.toDouble()
                    operation = "-"
                    last = true
                    subtract = true
                } else {
                    calculate -= tvResult.toDouble()
                    operation = "-"
                    last = true
                    subtract = true
                }
            }
            buttonMultiply.id -> {
                if (operation.equals("")) {
                    calculate = tvResult.toDouble()
                    operation = "*"
                    last = true
                    multiply = true
                } else {
                    calculate *= tvResult.toDouble()
                    operation = "*"
                    last = true
                    multiply = true
                }
            }
            buttonDivide.id -> {
                if (operation.equals("")) {
                    calculate = tvResult.toDouble()
                    operation = "/"
                    last = true
                    divide = true
                } else {
                    calculate = tvResult.toDouble()
                    operation = "/"
                    last = true
                    divide = true
                }
            }
            buttonAddSubtract.id -> {
                calculate = tvResult.toDouble() * -1
                tvResults.text = calculate.toString()
            }
            buttonPercent.id -> {
                calculate = tvResult.toDouble() / 100
                tvResults.text = calculate.toString()
            }
            buttonEqual.id -> {
                if (add) {
                    calculate += tvResult.toDouble()
                    tvResults.text = calculate.toString()
                    operation = ""
                    add = false
                    last = true
                } else if (subtract) {
                    calculate -= tvResult.toDouble()
                    operation = ""
                    tvResults.text = calculate.toString()
                    subtract = false
                    last = true
                } else if (multiply) {
                    calculate *= tvResult.toDouble()
                    tvResults.text = calculate.toString()
                    operation = ""
                    multiply = false
                    last = true
                } else if (divide) {
                    calculate /= tvResult.toDouble()
                    tvResults.text = calculate.toString()
                    operation = ""
                    divide = false
                    last = true
                } else {
                    last = true
                }
                Log.d("Calculate success", calculate.toString() + "")
            }
        }
    }
}