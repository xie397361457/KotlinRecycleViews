package com.recyclerviews.kotlin.textAndBitmapList

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.recyclerviews.kotlin.R

/**
 * target :
 * @author nuo
 */
class TextAndBitmaoListAdapter(var context: Context,var list : MutableList<PersionData>?) : RecyclerView.Adapter<TextAndBitmapViewHolder>() {

    override fun onBindViewHolder(holder: TextAndBitmapViewHolder?, position: Int) {
        holder!!.nameView!!.setText("名字 : " + list!!.get(position).name)
        holder!!.sexView!!.setText("性别 : " + list!!.get(position).sex)
        holder!!.descriptionView!!.setText("描述 : " + list!!.get(position).description)
        /**
         * 裁剪图片 圆形
         */
        Glide.with(context).load(list!!.get(position).headUrl)
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .transform(GlideCircleTransform(context))
                .into(holder!!.headView)
    }

    override fun getItemCount(): Int {
        return if (list == null) 0 else list!!.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TextAndBitmapViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_text_and_bitmap_list,parent,false)
        var viewHolder = TextAndBitmapViewHolder(view)
        return viewHolder
    }
}