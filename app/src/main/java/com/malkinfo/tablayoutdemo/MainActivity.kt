package com.malkinfo.tablayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.malkinfo.tablayoutdemo.model.PagerAdapters
import com.malkinfo.tablayoutdemo.view.HomeFragment
import com.malkinfo.tablayoutdemo.view.NotificationFragment
import com.malkinfo.tablayoutdemo.view.SearchFragment

class MainActivity : AppCompatActivity() {
    private lateinit var pToolbar: Toolbar
    private lateinit var pTabs:TabLayout
    private lateinit var ptitle:TextView
    private lateinit var pViewPager:ViewPager
    private lateinit var pagerAdapters: PagerAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set find Id*/
        pToolbar = findViewById(R.id.pToolBar)
        ptitle = findViewById(R.id.titleText)
        pTabs = findViewById(R.id.tabs)
        /**set Toolbar*/
        pToolbar.setTitle("")
        ptitle.setText("TabLayout Demo: ")
        setSupportActionBar(pToolbar)
        pViewPager = findViewById(R.id.myPagerView)
        pagerAdapters = PagerAdapters(supportFragmentManager)
        /**set Fragment List*/
        pagerAdapters.addFragment(HomeFragment(),"")
        pagerAdapters.addFragment(SearchFragment(),"")
        pagerAdapters.addFragment(NotificationFragment(),"")
        /** set view page adapter*/
        pViewPager.adapter = pagerAdapters
        /** set tabs*/
        pTabs.setupWithViewPager(pViewPager)
        /**ok now add icon*/
        pTabs.getTabAt(0)!!.setIcon(R.drawable.ic__home)
        pTabs.getTabAt(1)!!.setIcon(R.drawable.ic_search)
        pTabs.getTabAt(2)!!.setIcon(R.drawable.ic_notifications)
    }
  /**ok now run it*/

}