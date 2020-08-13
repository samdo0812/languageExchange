package com.example.languageexchange.memo

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.languageexchange.list.ListModel
import kotlinx.android.synthetic.main.layout_recycler_item.view.*

class MemoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val TAG: String = "로그"

    private val lang1TextView = itemView.lang1

    //데이터와 뷰를 묶는다
    fun bind(listModel: ListModel){
        lang1TextView.text = listModel.lang1

    }
}