package com.example.languageexchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_add_word.*
import kotlinx.android.synthetic.main.fragement_memo.*

class AddWordAcitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_word)



        Log.d("word",""+addword_word )
        // 프라그먼트에 data를 넣어주는 방법


        go_memo.setOnClickListener {
         val MemoFragment :  MemoFragment = MemoFragment()
         var addword_word  = add_word.getText()
         var addword_mean = addword_mean.getText()
            val bundle: Bundle = Bundle()
            bundle.putString("word", ""+addword_word)
            bundle.putString("word", ""+addword_mean)
            MemoFragment.arguments = bundle
        }
    }
}
