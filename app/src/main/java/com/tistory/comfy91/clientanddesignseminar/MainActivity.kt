package com.tistory.comfy91.clientanddesignseminar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUi()
    }

    private fun initUi() {
        Glide.with(this).load(R.drawable.search_btn_back).into(imgv_back)
        Glide.with(this).load(R.drawable.search_btn_plus).into(imgv_tab_plus)
        tab_viewpager.adapter =
            SearchPagerAdapter(
                supportFragmentManager
            )
        tab_viewpager.offscreenPageLimit = 2


        tab_viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_items))

        tab_items.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {}

            override fun onTabUnselected(p0: TabLayout.Tab?) {}

            override fun onTabSelected(p0: TabLayout.Tab?) {
                p0?.let {
                    tab_viewpager.currentItem = it.position
                }
            }
        })



    }
}
