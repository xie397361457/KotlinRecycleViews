package com.recyclerviews.kotlin.textlists

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.recyclerviews.kotlin.R
import kotlinx.android.synthetic.main.activity_test_list.*

class TestListActivity : AppCompatActivity() {

    var values= mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_list)
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
        val divider = DividerItemDecoration(this,DividerItemDecoration.VERTICAL)
        //添加自定义分割线,不写则加入的是系统自带分割线
        divider.setDrawable(ContextCompat.getDrawable(this,R.drawable.custom_divider))
        recyclerView_one.addItemDecoration(divider)
        //设置布局
        recyclerView_one.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView_one.adapter = TestListAdapter(this,values)
    }
}
