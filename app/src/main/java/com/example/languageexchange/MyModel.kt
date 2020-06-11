package com.example.languageexchange

import android.util.Log

class MyModel(var lang1: String, var lang2: String) {

    val TAG: String ="log"

    //기본 생성자
    init{
        Log.d(TAG,"MyModel - init called")
    }
}