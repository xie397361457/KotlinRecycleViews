package com.recyclerviews.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.recyclerviews.kotlin.bitmapLists.BitmapListsActivity
import com.recyclerviews.kotlin.custompullrefresh.CustomPullRefeshActivity
import com.recyclerviews.kotlin.systempullrefresh.SystemPullRefreshActivity
import com.recyclerviews.kotlin.textAndBitmapList.TextAndBitmapActivity
import com.recyclerviews.kotlin.textlists.TestListActivity
import com.recyclerviews.kotlin.waterfallLists.WaterfallActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.one -> {
                var intent = Intent(this, TestListActivity::class.java)
                startActivity(intent)
            }
            R.id.two -> {
                var intent = Intent(this, BitmapListsActivity::class.java)
                startActivity(intent)
            }
            R.id.three -> {
                var intent = Intent(this, TextAndBitmapActivity::class.java)
                startActivity(intent)
            }
            R.id.four -> {
                var intent = Intent(this, WaterfallActivity::class.java)
                startActivity(intent)
            }
            R.id.six -> {
                var intent = Intent(this, SystemPullRefreshActivity::class.java)
                startActivity(intent)
            }
            R.id.eight -> {
                var intent = Intent(this, CustomPullRefeshActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        one.setOnClickListener(this)
        two.setOnClickListener(this)
        three.setOnClickListener(this)
        four.setOnClickListener(this)
        six.setOnClickListener(this)
        eight.setOnClickListener(this)
    }
}
