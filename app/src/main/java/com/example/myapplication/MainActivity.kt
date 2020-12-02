package com.example.myapplication

import android.database.DefaultDatabaseErrorHandler
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import org.intellij.lang.annotations.RegExp
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    lateinit var button1: ImageButton
    lateinit var button2: ImageButton
    lateinit var button3: ImageButton
    lateinit var button4: ImageButton
    lateinit var button5: ImageButton
    lateinit var button6: ImageButton
    lateinit var button7: ImageButton
    lateinit var button8: ImageButton
    lateinit var button9: ImageButton
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button)
        button5 = findViewById(R.id.button5)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        resetButton = findViewById(R.id.gadatvirtfva)
        gauqmeba()


    }

    fun Click(view: View) {
        var ClickSelected = view as ImageButton
        var cellID = 0
        when (ClickSelected.id) {
            R.id.button -> cellID = 1
            R.id.button2 -> cellID = 2
            R.id.button3 -> cellID = 3
            R.id.button4 -> cellID = 4
            R.id.button5 -> cellID = 5
            R.id.button6 -> cellID = 6
            R.id.button7 -> cellID = 7
            R.id.button8 -> cellID = 8
            R.id.button9 -> cellID = 9

        }
        itamashetamashi(cellID, ClickSelected)
    }

    var motamashe1 = ArrayList<Int>()
    var motamashe2 = ArrayList<Int>()
    var aqtiurimotamashe = 1

    private fun itamashetamashi(cellID: Int, ClickSelected: ImageButton) {
        if (aqtiurimotamashe == 1) {
           // ClickSelected.text = "X"
            ClickSelected.setImageResource(R.drawable.narutoeye)
            motamashe1.add(cellID)
            aqtiurimotamashe = 2

        } else {
            //ClickSelected.text = "O"
            ClickSelected.setImageResource(R.drawable.sasukeeye)
            motamashe2.add(cellID)
            aqtiurimotamashe = 1

        }
        ClickSelected.isEnabled = false
        gamarjvebulimotamashe()

    }

    private fun gamarjvebulimotamashe() {
        var gamarjvebuli = -1
        //სტრიქონები
        if (motamashe1.contains(1) && motamashe1.contains(2) && motamashe1.contains(3)) {
            gamarjvebuli = 1
        }
        if (motamashe2.contains(1) && motamashe2.contains(2) && motamashe2.contains(3)) {
            gamarjvebuli = 2
        }
        if (motamashe1.contains(4) && motamashe1.contains(5) && motamashe1.contains(6)) {
            gamarjvebuli = 1
        }
        if (motamashe2.contains(4) && motamashe2.contains(5) && motamashe2.contains(6)) {
            gamarjvebuli = 2
        }
        if (motamashe1.contains(7) && motamashe1.contains(8) && motamashe1.contains(9)) {
            gamarjvebuli = 1
        }
        if (motamashe2.contains(7) && motamashe2.contains(8) && motamashe2.contains(9)) {
            gamarjvebuli = 2
        }
        //სვეტები
        if (motamashe1.contains(2) && motamashe1.contains(5) && motamashe1.contains(8)) {
            gamarjvebuli = 1
        }
        if (motamashe2.contains(2) && motamashe2.contains(5) && motamashe2.contains(8)) {
            gamarjvebuli = 2
        }
        if (motamashe1.contains(1) && motamashe1.contains(4) && motamashe1.contains(7)) {
            gamarjvebuli = 1
        }
        if (motamashe2.contains(1) && motamashe2.contains(4) && motamashe2.contains(7)) {
            gamarjvebuli = 2
        }
        if (motamashe1.contains(3) && motamashe1.contains(6) && motamashe1.contains(9)) {
            gamarjvebuli = 1
        }
        if (motamashe2.contains(3) && motamashe2.contains(6) && motamashe2.contains(9)) {
            gamarjvebuli = 2
        }
        //დიაგონალები
        if (motamashe1.contains(1) && motamashe1.contains(5) && motamashe1.contains(9)) {

            gamarjvebuli = 1
        }
        if (motamashe2.contains(1) && motamashe2.contains(5) && motamashe2.contains(9)) {

            gamarjvebuli = 2
        }
        if (motamashe1.contains(3) && motamashe1.contains(5) && motamashe1.contains(7)) {

            gamarjvebuli = 1
        }
        if (motamashe2.contains(3) && motamashe2.contains(5) && motamashe2.contains(7)) {

            gamarjvebuli = 2
        }
        if (gamarjvebuli != -1) {
            if (gamarjvebuli == 1) {
                Toast.makeText(this, "გაიმარჯვა პირველმა მოთამაშემ", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "გაიმარჯვა მეორე მოთამაშემ", Toast.LENGTH_LONG).show()
            }
            disable()

        }

    }

    fun disable() {
        button1.isEnabled = false
        button2.isEnabled = false
        button3.isEnabled = false
        button4.isEnabled = false
        button5.isEnabled = false
        button6.isEnabled = false
        button7.isEnabled = false
        button8.isEnabled = false
        button9.isEnabled = false

    }

    fun gauqmeba() {
        resetButton.setOnClickListener {

            button1.isEnabled = true
            button2.isEnabled = true
            button3.isEnabled = true
            button4.isEnabled = true
            button5.isEnabled = true
            button6.isEnabled = true
            button7.isEnabled = true
            button8.isEnabled = true
            button9.isEnabled = true
            motamashe1.clear()
            motamashe2.clear()
            aqtiurimotamashe = 1
            button1.setImageResource(android.R.color.transparent)
            button2.setImageResource(android.R.color.transparent)
            button3.setImageResource(android.R.color.transparent)
            button4.setImageResource(android.R.color.transparent)
            button5.setImageResource(android.R.color.transparent)
            button6.setImageResource(android.R.color.transparent)
            button7.setImageResource(android.R.color.transparent)
            button8.setImageResource(android.R.color.transparent)
            button9.setImageResource(android.R.color.transparent)




        }
    }
}