package com.example.languageexchange

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerAdapter: RecyclerView.Adapter<MyViewHolder>() {


    private var modelList = ArrayList<MyModel>()

    //뷰홀더 생성 되었을 떄
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_recycler_item, parent, false))
    }

    //목록의 수
    override fun getItemCount(): Int {
        return this.modelList.size
    }

    //뷰와 뷰홀더가 묶였을 때
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.d("TAG", "MyRecyclerAdapter - onBindViewHolder() called")
        holder.bind(this.modelList[position])
    }

    //외부에서 데이터 넘기기
    fun submitList(modelList: ArrayList<MyModel>){
        this.modelList = modelList
    }
}