package com.example.languageexchange.memo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.replace

import com.example.languageexchange.R
import kotlinx.android.synthetic.main.fragment_add_word.*


class AddWordFragment : Fragment() {
    val TAG: String = "로그"

    companion object{
        fun  newInstance(): AddWordFragment {
            return AddWordFragment()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_word, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val memoFragment:MemoFragment = MemoFragment()

        plus_word.setOnClickListener {
            var word = word.text.toString()

            val bundle:Bundle = Bundle()
            bundle.putString("word",word)


            val transaction = activity?.supportFragmentManager?.beginTransaction()
            memoFragment.arguments = bundle
            transaction?.replace(R.id.fragments_frame, MemoFragment())
           // transaction?.disallowAddToBackStack()
            transaction?.commit()
            Log.d("TAG", bundle.toString())
        }
    }
}



