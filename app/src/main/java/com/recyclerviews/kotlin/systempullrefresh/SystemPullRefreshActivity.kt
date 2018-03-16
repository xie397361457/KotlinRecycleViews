package com.recyclerviews.kotlin.systempullrefresh

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.recyclerviews.kotlin.R
import com.recyclerviews.kotlin.textlists.TestListAdapter
import kotlinx.android.synthetic.main.activity_system_pullrefresh.*

class SystemPullRefreshActivity : AppCompatActivity() {


    var values= mutableListOf<String>()

    var values2= mutableListOf<String>()

    var adapter : TestListAdapter?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_system_pullrefresh)
        addData()
        bindAdapter()
    }
    /**
     * 添加虚拟数据
     */
    private fun  addData(){
        values.add("number1")
        values.add("number2")
        values.add("number3")
        values.add("number4")
        values.add("number5")
        values.add("number6")
        values.add("number7")
        values.add("number8")
    }
    /**
     * 绑定adapter
     */
    private fun bindAdapter(){
        //设置分割线
        val divider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        //添加自定义分割线,不写则加入的是系统自带分割线
        divider.setDrawable(ContextCompat.getDrawable(this,R.drawable.custom_divider))
        recyclerView_six.addItemDecoration(divider)
        //设置布局
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_six.layoutManager = linearLayoutManager
        adapter = TestListAdapter(this,values2)
        recyclerView_six.adapter = adapter
        swipeRefresh_layout.setOnRefreshListener {
            values2.addAll(values)
            adapter!!.notifyDataSetChanged()
            swipeRefresh_layout.isRefreshing = false//停止动画
        }
    }

}
