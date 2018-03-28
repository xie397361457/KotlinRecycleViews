package com.recyclerviews.kotlin.custompullrefresh

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.recyclerviews.kotlin.R
import com.recyclerviews.kotlin.custompullrefresh.Constant.Result
import com.recyclerviews.kotlin.custompullrefresh.Constant.Side
import com.recyclerviews.kotlin.custompullrefresh.Inteface.OnPullListener
import com.recyclerviews.kotlin.custompullrefresh.Main.PullableComponent
import com.recyclerviews.kotlin.textlists.TestListAdapter
import kotlinx.android.synthetic.main.activity_custom_pull_refesh.*

class CustomPullRefeshActivity : AppCompatActivity(),OnPullListener {


    var values= mutableListOf<String>()

    var values2= mutableListOf<String>()

    var adapter : TestListAdapter?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_pull_refesh)
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
        customPullRefreshRecyclerView.addItemDecoration(divider)
        //设置布局
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        customPullRefreshRecyclerView.layoutManager = linearLayoutManager
        adapter = TestListAdapter(this,values2)
        customPullRefreshRecyclerView.adapter = adapter

        customPullableLayout.topComponent.setOnPullListener(this)
        customPullableLayout.bottomComponent.setOnPullListener(this)
    }

    /**
     * 上下拉刷新加载监听
     */
    override fun onCanceled(pullableComponent: PullableComponent?) {
        Log.d("onCanceled","onCanceled")
    }

    /**
     * 开始加载
     */
    override fun onLoading(pullableComponent: PullableComponent?) {
        Log.d("onLoading","onLoading")
        when (pullableComponent!!.side){
            Side.TOP ->{
                values2.clear()
                Log.d("onLoading","TOP")
            }
            Side.BOTTOM->{
                values2.addAll(values)
                Log.d("onLoading","BOTTOM")
            }
        }
        adapter!!.notifyDataSetChanged()
        customPullableLayout.topComponent.finish(Result.SUCCEED)
        customPullableLayout.bottomComponent.finish(Result.SUCCEED)
    }

    /**
     * 上下拉尺寸改变
     */
    override fun onSizeChanged(pullableComponent: PullableComponent?, mSize: Int) {
        Log.d("onSizeChanged","onSizeChanged")
    }
}
