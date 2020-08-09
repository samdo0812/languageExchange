package com.example.languageexchange.list

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_recycler_item.view.*

//커스텀 뷰홀더
class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val TAG: String = "로그"

    private val lang1TextView = itemView.lang1
    //private val lang2TextView = itemView.lang2


    //생성자
    init {
        Log.d("TAG", "MyViewHolder - init() called")
    }

    //데이터와 뷰를 묶는다
    fun bind(listModel: ListModel){
        Log.d("TAG", "MyViewHolder - bind() called")
        lang1TextView.text = listModel.lang1
      //  lang2TextView.text = myModel.lang2

    }
}
