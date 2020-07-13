package com.example.languageexchange

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragement_memo.*


class MemoFragment : Fragment() {

    //private lateinit var myRecyclerAdapter_memo: MyRecyclerAdapter_memo


    companion object{
        const val TAG : String = "로그"

        fun  newInstance():MemoFragment{
            return MemoFragment()
        }
    }

    //메모리에 올라갔을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"MemoFragment - onCreate() called")

    }

    //최종 초기화
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        add_word.setOnClickListener {
            activity?.let {
                val intent = Intent(context, AddWordAcitivity::class.java)
                startActivity(intent)
                }
            }
        }


    //프레그먼트를 안고 있는 엑티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"MemoFragment - onAttach() called")
    }

    //뷰가 생성 되었을 때
    //프래그먼트와 레이아웃을 연결시켜주는 부분이다.
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        Log.d(TAG,"MemoFragment - onCreateView() called")
        val view = inflater.inflate(R.layout.fragement_memo, container, false)
        return view
    }
}

