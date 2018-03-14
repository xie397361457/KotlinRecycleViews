package com.recyclerviews.kotlin

import android.content.Context
import android.graphics.BitmapFactory
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

/**
 * 获取本地图片宽高数组
 */
fun  Context.getImageWidthAndHeight(path : String) : Array<Int>{
    var options = BitmapFactory.Options()
    /**
     * 最关键在此，把options.inJustDecodeBounds = true;
     * 这里再decodeFile()，返回的bitmap为空，但此时调用options.outHeight时，已经包含了图片的高了
     */
    options.inJustDecodeBounds = true
    var bitmap = BitmapFactory.decodeFile(path, options) // 此时返回的bitmap为null
    return arrayOf(options.outWidth,options.outHeight)
}


