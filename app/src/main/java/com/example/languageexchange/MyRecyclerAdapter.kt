package com.example.languageexchange

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.languageexchange.list.ListModel
import com.example.languageexchange.list.ListViewHolder

class MyRecyclerAdapter: RecyclerView.Adapter<ListViewHolder>() {


    private var modelList = ArrayList<ListModel>()

    //뷰홀더 생성 되었을 떄
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(R.layout.layout_recycler_item, parent, false)
        )
    }

    //목록의 수
    override fun getItemCount(): Int {
        return this.modelList.size
    }

    //뷰와 뷰홀더가 묶였을 때
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        Log.d("TAG", "MyRecyclerAdapter - onBindViewHolder() called")
        holder.bind(this.modelList[position])
    }

    //외부에서 데이터 넘기기
    fun submitList(modelList: ArrayList<ListModel>){
        this.modelList = modelList
    }
}