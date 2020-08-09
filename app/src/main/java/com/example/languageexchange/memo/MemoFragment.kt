package com.example.languageexchange.memo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.languageexchange.R
import kotlinx.android.synthetic.main.fragement_memo.*


class MemoFragment : Fragment() {

    //private lateinit var myRecyclerAdapter_memo: MyRecyclerAdapter_memo
    lateinit var getWord :String

    companion object{
        const val TAG : String = "로그"

        fun  newInstance(): MemoFragment {
            return MemoFragment()
        }
    }

    /*
    fragment life cycle
    onAttach
    onCreate
    onCreateView -> fragment가 인터페이스를 처음으로 그릴 때
    onViewCreated
    onActivityCreated
    onStart
    onResume
    */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragement_memo, container, false)
        return view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //go to word add activity
        add_word.setOnClickListener {
            activity?.let {
                val intent = Intent(activity, AddWord::class.java)
                startActivity(intent)
                }
            }
        val arg = arguments
        if (arg != null) {
            val data = arguments?.getString("word")
           // Log.d("test",data)
        }
    }
}

