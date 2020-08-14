package com.example.languageexchange.memo

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_recycler_memoitem.view.*

class MemoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val TAG: String = "로그"

    private val wordTextView = itemView.recycler_addword

    //데이터와 뷰를 묶는다
    fun bind(memoModel: MemoModel){
        wordTextView.text = memoModel.word
    }
}