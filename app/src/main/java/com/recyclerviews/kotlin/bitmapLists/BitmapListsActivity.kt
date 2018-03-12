package com.recyclerviews.kotlin.bitmapLists

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.recyclerviews.kotlin.R
import kotlinx.android.synthetic.main.activity_bitmap_lists.*

class BitmapListsActivity : AppCompatActivity() {

    var cars = arrayOf(
            "http://pic1.win4000.com/mobile/a/538fd4bc39981.jpg",
            "http://img.51ztzj.com/upload/image/20140724/sj201407231023_279x419.jpg",
            "http://img.tupianzj.com/uploads/Bizhi/sjqc13_6401.jpg",
            "http://pic.ffpic.com/files/2014/0517/0516jsqcgqiphonebz6.jpg",
            "http://n1.itc.cn/img8/wb/recom/2016/06/13/146580705227214861.JPEG",
            "http://s9.knowsky.com/iphone/l/16/2012082904351956236.jpg",
            "http://img4.imgtn.bdimg.com/it/u=2517099869,3154545992&fm=214&gp=0.jpg",
            "http://pic1.win4000.com/mobile/a/538fd4b8e016f.jpg",
            "http://pic.58pic.com/58pic/13/64/85/85k58PICA84_1024.jpg",
            "http://n1.itc.cn/img8/wb/recom/2016/06/13/146580705311270319.JPEG",
            "http://img.51ztzj.com/upload/image/20140724/sj201407231023_279x419.jpg",
            "http://i8.download.fd.pchome.net/t_320x520/g1/M00/10/00/ooYBAFVtCdqIXyOvAABDqaVbX6cAACg_gIJlJ8AAEPB658.jpg",
            "http://pic1.win4000.com/mobile/a/538fd4bdbab5b.jpg",
            "http://img2.imgtn.bdimg.com/it/u=265746542,1898147300&fm=214&gp=0.jpg",
            "http://img.zcool.cn/community/016c4b59537924a8012193a31fda44.jpg",
            "http://android-screenimgs.25pp.com/20121217/1536/2002277de724594a.jpg",
            "http://img.kutoo8.com/upload/image/48980280/2013xinkuanmengdiao_320x480.jpg",
            "http://pic1.win4000.com/mobile/f/52023a7c1b95c.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bitmap_lists)
        bindAdapter()
    }

    /**
     * 绑定adapter
     */
    private fun bindAdapter(){
        //设置分割线
        val divider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        //添加自定义分割线,不写则加入的是系统自带分割线
        //divider.setDrawable(ContextCompat.getDrawable(this,R.drawable.custom_divider))
        recyclerView_two.addItemDecoration(divider)
        //设置布局
        recyclerView_two.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_two.adapter = BitmapListsAdapter(this,cars)
    }
}
