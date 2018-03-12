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