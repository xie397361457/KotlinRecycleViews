package com.recyclerviews.kotlin.textlists

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.recyclerviews.kotlin.R

/**
 * target :
 * @author nuo
 */
class TestListViewHolder constructor(var view: View): RecyclerView.ViewHolder(view) {

    var textView : TextView? = null

    init {
        textView = view.findViewById(R.id.tv)
    }
}