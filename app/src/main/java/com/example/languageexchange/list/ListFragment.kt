package com.example.languageexchange.list

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.languageexchange.R
import kotlinx.android.synthetic.main.fragement_list.*

class ListFragment : Fragment() {
    //데이터를 담을 그릇, 배열
    var modelList = ArrayList<ListModel>()
    private lateinit var listRecyclerAdapter: ListRecyclerAdapter

    companion object{
        const val TAG : String = "로그"

        fun  newInstance(): ListFragment {
            return ListFragment()
        }
    }

    //프레그먼트를 안고 있는 엑티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    //메모리에 올라갔을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"ListFragment - onCreate() called")

    }
    //뷰가 생성 되었을 때
    //프래그먼트와 레이아웃을 연결시켜주는 부분이다.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragement_list, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        for(i in 1..10){
            var myModel =
                ListModel("안녕 $i", "hello $i")
            this.modelList.add(myModel)
        }

        //어댑터 인스턴스 생성
        listRecyclerAdapter = ListRecyclerAdapter()
        listRecyclerAdapter.submitList(this.modelList)

        //리사이클러뷰 설정
        my_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
            //어댑터 장착
            adapter = listRecyclerAdapter

        }
    }


}