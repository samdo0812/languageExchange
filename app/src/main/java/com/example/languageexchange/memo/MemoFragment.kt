package com.example.languageexchange.memo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.languageexchange.R
import kotlinx.android.synthetic.main.fragement_list.*
import kotlinx.android.synthetic.main.fragement_memo.*

class MemoFragment : Fragment() {
   // val bundle = arguments
    private lateinit var AddWordFragment:AddWordFragment
    val TAG: String = "로그"
    lateinit var word: String
    lateinit var result:String
    lateinit var MemoRecyclerAdapter:MemoRecyclerAdapter

    var modelList = ArrayList<MemoModel>()

    companion object{
        fun  newInstance(): MemoFragment {
            return MemoFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //addWordFragment -> MemoFragment put in data, data setting
        setFragmentResultListener("word") { key, bundle ->
             result = bundle.getString("word").toString()
            var myModel = MemoModel(result)
            this.modelList.add(myModel)
        }

    }

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
        //단어추가 프래그먼트로 이동
        add_word.setOnClickListener {
           val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragments_frame, AddWordFragment())
            transaction?.disallowAddToBackStack()
            transaction?.commit()
        }

        if(this.modelList != null) {
            MemoRecyclerAdapter = MemoRecyclerAdapter()
            MemoRecyclerAdapter.submitList(this.modelList)

            memo_recycler_view.apply {
                layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
                //어댑터 장착
                adapter = MemoRecyclerAdapter
            }
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("word",result)
    }
}

