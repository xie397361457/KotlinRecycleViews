package com.recyclerviews.kotlin.bitmapLists

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.recyclerviews.kotlin.R



/**
 * target :
 * @author nuo
 */
class BitmapListsAdapter(var context: Context,var arrays: Array<String>) : RecyclerView.Adapter<BitmapListViewHolder>() {

    override fun onBindViewHolder(holder: BitmapListViewHolder?, position: Int) {
        var url = arrays[position]
        if (null == holder || null == holder || url.equals("")){
            return
        }
        //下载图片
        Glide.with(context).load(arrays[position]).into(holder.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BitmapListViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_bitmap_list,parent,false)
        return BitmapListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return if (arrays == null) 0 else arrays.size
    }
}