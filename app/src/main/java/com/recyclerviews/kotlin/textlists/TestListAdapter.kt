package com.recyclerviews.kotlin.textlists

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.recyclerviews.kotlin.R
import com.recyclerviews.kotlin.showToast

/**
 * target :
 * @author nuo
 */
class TestListAdapter constructor(var context : Context,var lists: MutableList<String>?) : RecyclerView.Adapter<TestListViewHolder>() {

    override fun getItemCount(): Int {
        return if (lists == null) 0 else lists!!.size
    }

    override fun onBindViewHolder(holder: TestListViewHolder?, position: Int) {
        holder!!.textView!!.text = lists!!.get(position)
        holder.itemView.setOnClickListener { onItemClick(position) }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TestListViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_test_list,parent,false)
        var holder = TestListViewHolder(view)
        return holder
    }

    /**
     * item点击事件
     */
    private fun onItemClick(position : Int){
        context.showToast("position = " +position +",value = " + lists!!.get(position))
    }

}