package com.example.languageexchange.memo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.languageexchange.R
import com.example.languageexchange.memo.MemoViewHolder

class MemoRecyclerAdapter :RecyclerView.Adapter<MemoViewHolder>() {
    private var modelList = ArrayList<MemoModel>()

    //뷰홀더 생성 되었을 떄
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemoViewHolder {
        return MemoViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(R.layout.layout_recycler_memoitem, parent, false)
        )
    }

    //목록의 수
    override fun getItemCount(): Int {
        return this.modelList.size
    }

    //뷰와 뷰홀더가 묶였을 때
    override fun onBindViewHolder(holder: MemoViewHolder, position: Int) {
        return holder.bind(this.modelList[position])
    }

    //외부에서 데이터 넘기기
    fun submitList(modelList: ArrayList<MemoModel>){
        this.modelList = modelList
    }




}