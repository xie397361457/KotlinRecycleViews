package com.recyclerviews.kotlin.textAndBitmapList

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.recyclerviews.kotlin.R

/**
 * target :
 * @author nuo
 */
class TextAndBitmapViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    var headView : ImageView? = null
    var nameView : TextView? = null
    var sexView : TextView? = null
    var descriptionView : TextView? = null

    init {
        headView = view.findViewById(R.id.head)
        nameView = view.findViewById(R.id.name_view)
        sexView = view.findViewById(R.id.sex_view)
        descriptionView = view.findViewById(R.id.description_view)
    }
}