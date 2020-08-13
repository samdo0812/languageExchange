package com.example.languageexchange.memo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.languageexchange.R
import com.example.languageexchange.memo.MemoViewHolder

class MemoRecyclerAdapter :RecyclerView<MemoViewHolder>() {

    //뷰홀더 생성 되었을 떄
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemoViewHolder {
        return MemoViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(R.layout.layout_recycler_memoitem, parent, false)
        )
    }




}