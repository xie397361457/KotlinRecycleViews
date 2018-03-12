package com.recyclerviews.kotlin.bitmapLists

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.recyclerviews.kotlin.R

/**
 * target :
 * @author nuo
 */
class BitmapListViewHolder(view :View) : RecyclerView.ViewHolder(view) {

    var imageView : ImageView? = null

    init {
        imageView = view.findViewById(R.id.imageView)
    }
}