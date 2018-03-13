package com.recyclerviews.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.recyclerviews.kotlin.bitmapLists.BitmapListsActivity
import com.recyclerviews.kotlin.textAndBitmapList.TextAndBitmapActivity
import com.recyclerviews.kotlin.textlists.TestListActivity
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
                showToast(resources.getString(R.string.recycleView_four))
            }
            R.id.five -> {
                showToast(resources.getString(R.string.recycleView_five))
            }
            R.id.six -> {
                showToast(resources.getString(R.string.recycleView_six))
            }
            R.id.seven -> {
                showToast(resources.getString(R.string.recycleView_seven))
            }
            R.id.eight -> {
                showToast(resources.getString(R.string.recycleView_eight))
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
        five.setOnClickListener(this)
        six.setOnClickListener(this)
        seven.setOnClickListener(this)
        eight.setOnClickListener(this)
    }
}
