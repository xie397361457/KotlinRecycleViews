package com.recyclerviews.kotlin.waterfallLists

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.StaggeredGridLayoutManager
import com.recyclerviews.kotlin.R
import com.recyclerviews.kotlin.bitmapLists.WaterfallListsAdapter
import kotlinx.android.synthetic.main.activity_waterfall.*


class WaterfallActivity : AppCompatActivity() {
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
        setContentView(R.layout.activity_waterfall)
        bindAdapter()
    }

    /**
     * 绑定adapter
     */
    private fun bindAdapter(){
        recyclerView_four.addItemDecoration(GridSpacingItemDecoration(2,10,true))
        //设置布局
        recyclerView_four.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView_four.adapter = WaterfallListsAdapter(this,cars)
        recyclerView_four.itemAnimator = DefaultItemAnimator()
        recyclerView_four.setHasFixedSize(true)
    }
}
