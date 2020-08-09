package com.example.languageexchange.memo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.languageexchange.R
import kotlinx.android.synthetic.main.activity_add_word.*

class AddWord : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_word)


        go_memo.setOnClickListener {
            val bundle: Bundle = Bundle()
            val MemoFragment: MemoFragment =
                MemoFragment()
            val word = addword_word.text.toString()
            bundle.putString("word", word)
            MemoFragment.arguments = bundle
        }
    }
}
