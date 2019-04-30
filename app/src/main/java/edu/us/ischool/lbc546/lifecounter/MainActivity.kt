package edu.us.ischool.lbc546.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = arrayOf(R.id.button_1, R.id.button_2, R.id.button_3, R.id.button_4,
            R.id.button_5, R.id.button_6, R.id.button_7, R.id.button_8,
            R.id.button_9, R.id.button_10, R.id.button_11, R.id.button_12,
            R.id.button_13, R.id.button_14, R.id.button_15, R.id.button_16)

        for (btn in buttons) {
            val button = findViewById<Button>(btn)
            button.setOnClickListener {
                val p = button.parent as View
                val playerLife: TextView
                val curr: CharSequence
                if (p.id == (R.id.p1)) {
                    playerLife = findViewById<TextView>(R.id.p1_lives)
                    curr = findViewById<TextView>(R.id.text1).text
                } else if (p.id == (R.id.p2)) {
                    playerLife = findViewById<TextView>(R.id.p2_lives)
                    curr = findViewById<TextView>(R.id.text2).text
                } else if (p.id == (R.id.p3)) {
                    playerLife = findViewById<TextView>(R.id.p3_lives)
                    curr = findViewById<TextView>(R.id.text3).text
                } else {
                    playerLife = findViewById<TextView>(R.id.p4_lives)
                    curr = findViewById<TextView>(R.id.text4).text
                }
                val newTotal = playerLife.text.toString().toInt() + button.text.toString().toInt()
                if (newTotal <= 0) {
                    val toast = Toast.makeText(applicationContext, curr.toString() + " LOSES!", Toast.LENGTH_LONG)
                    toast.show()
                }
                playerLife.text = newTotal.toString()
            }
        }
    }
}
