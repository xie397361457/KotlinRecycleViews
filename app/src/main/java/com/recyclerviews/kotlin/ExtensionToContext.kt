package com.recyclerviews.kotlin

import android.content.Context
import android.widget.Toast

/**
 * target : 扩展函数
 * @author nuo
 */
fun Context.showToast(value: String){
    Toast.makeText(this,value,Toast.LENGTH_LONG).show()
}

/**
 * 获取屏幕宽度
 * @context 上下文
 */
fun Context.getScreeWidth(context: Context) : Int{
    val d = context.resources.displayMetrics
    return d.widthPixels
}
