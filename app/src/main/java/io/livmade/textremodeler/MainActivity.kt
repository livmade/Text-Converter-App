package io.livmade.textremodeler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reversebtn.setOnClickListener {
            var newText = editText.text.toString()
            val reverseMe = newText.reversed()
            results.text = reverseMe
        }
        pigLatinbtn.setOnClickListener {
            var newText = editText.text.toString()
            val pig = newText.drop(1) + newText[0] + "ay"
            results.text = pig
        }

        vowelsbtn.setOnClickListener {
            var newText = editText.text.toString()
            var vowels = 0
            var newTextVow = newText.toLowerCase()
            for (i in 0..newTextVow.length - 1) {
                val ch = newTextVow[i]
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++vowels
                }
            }
            if (vowels == 1) {
                results.text = "There is $vowels vowel."
        } else {
                results.text = "There are $vowels vowels."
            }

        }

        clearBtn.setOnClickListener {
            editText.text.clear()
        }
    }
}
