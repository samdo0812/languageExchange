package com.example.languageexchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //
    private lateinit var ListFragment:ListFragment
    private lateinit var StarFragment:StarFragment
    private lateinit var MemoFragment:MemoFragment
    private lateinit var SettingFragment:SettingFragment

    companion object{
        const val TAG:String = "log"
    }
    //메모리에 올라 갔을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //레이아웃과 연결
        setContentView(R.layout.activity_main)
        Log.d(TAG,"MainActivity - onCreate() called")

        bottom_nav.setOnNavigationItemSelectedListener(onBottomNavItemSelectedListner)

        ListFragment = com.example.languageexchange.ListFragment.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.fragments_frame, ListFragment).commit()
    }

    //바텀네비게이션 아이템 클릭 리스너 설정
    private val onBottomNavItemSelectedListner = BottomNavigationView.OnNavigationItemSelectedListener{
        when(it.itemId) {
            R.id.menu_list -> {
                ListFragment = com.example.languageexchange.ListFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, ListFragment).commit()
            }
            R.id.menu_star -> {
                StarFragment = com.example.languageexchange.StarFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, StarFragment).commit()
            }
            R.id.menu_memo -> {
                MemoFragment = com.example.languageexchange.MemoFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, MemoFragment).commit()
            }
            R.id.menu_setting -> {
                SettingFragment = com.example.languageexchange.SettingFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, SettingFragment).commit()
            }
        }
        true
    }
/*
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        Log.d(TAG,"MainActivity - onNavigationItemSelected() called")

        when(item.itemId){
            R.id.menu_list->{

            }
            R.id.menu_star->{

            }
            R.id.menu_memo->{

            }
            R.id.menu_setting->{

            }
        }

        return true
    }
*/
}
