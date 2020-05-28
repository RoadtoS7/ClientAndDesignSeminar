package com.tistory.comfy91.clientanddesignseminar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_viewPager.adapter = TabPagerAdapter(supportFragmentManager)
        main_viewPager.offscreenPageLimit = 1

        main_tab.setupWithViewPager(main_viewPager)
        main_tab.getTabAt(0)!!.setText("즐겨찾기")
        main_tab.getTabAt(1)!!.setText("전체 카테고리")
    }
}
