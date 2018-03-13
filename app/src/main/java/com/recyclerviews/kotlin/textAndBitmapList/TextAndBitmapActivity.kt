package com.recyclerviews.kotlin.textAndBitmapList

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.recyclerviews.kotlin.R
import kotlinx.android.synthetic.main.activity_text_and_bitmap.*

class TextAndBitmapActivity : AppCompatActivity() {

    private var listData : MutableList<PersionData>? = null
    private var heads = arrayOf("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1520932898382&di=6f83e6499bf5807fb892c944e17b8179&imgtype=0&src=http%3A%2F%2Fi1.hdslb.com%2Fbfs%2Farchive%2Ffbb7ff5b5b2851ea0e87b0ca8cb4df33c55724d0.png",
            "https://t11.baidu.com/it/u=3271295005,1754503011&fm=170&s=3534CB3406E17701673C55DE0300C0A0&w=640&h=640&img.JPEG",
            "http://imgsrc.baidu.com/forum/w=580/sign=dd7763a33ffae6cd0cb4ab693fb20f9e/4ace233fb80e7bec1ebb8175252eb9389a506b14.jpg",
            "http://u.candou.com/2016/0803/1470188695276.jpg",
            "http://img4.imgtn.bdimg.com/it/u=1493340710,904634546&fm=27&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=3571327833,1871127534&fm=27&gp=0.jpg",
            "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3384358481,1304213414&fm=27&gp=0.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1520932720412&di=e16ae72fd15290abc4e7e5b839694269&imgtype=0&src=http%3A%2F%2Fimg1.shenchuang.com%2F2018%2F0305%2F97b3a7eb2372a1a7334601aacb028d8f.jpg")
    private var names = arrayOf(
            "旭旭宝宝",
            "MISS大小姐",
            "轩墨宝宝",
            "董弱鸡",
            "陈一发",
            "冯提莫",
            "张琪格",
            "呆妹儿"
            )
    private var sexs = arrayOf("男","女","女","男","女","女","女","女")

    private var descriptions = arrayOf("国服第一增幅强化王,擅长荒古遗精大法,擅长话语:对,感觉很对.",
            "魔兽争霸比赛冠军,知名解说,MISS排位日记等,参加过多个综艺节目,特点平胸",
            "国服第一扳手,擅长化妆,大变女人",
            "出名与直播英雄联盟,靠买食品为生,外号:宁波鸽子王",
            "斗鱼一姐,擅长唱歌,聊天",
            "天王盖地虎,提莫一米五,斗鱼主播,与发姐争夺一姐之位",
            "斗鱼三骚之一,靠跳舞出名,直播各种福利,曾卖过飞机杯",
            "死平胸,老女人,技术差,意识苟,对A要不起.")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_and_bitmap)
        bindData()
        setAdapter()
    }

    /**
     * 绑定数据
     */
    private fun bindData(){
        listData = mutableListOf<PersionData>()
        for (i in 0..(heads.count()-1)){
            var persion  = PersionData()
            persion.headUrl = heads[i]
            persion.sex = sexs[i]
            persion.name = names[i]
            persion.description = descriptions[i]
            listData!!.add(persion)
        }
    }

    private fun setAdapter(){
        //设置分割线
        val divider = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        //添加自定义分割线,不写则加入的是系统自带分割线
        //divider.setDrawable(ContextCompat.getDrawable(this,R.drawable.custom_divider))
        recyclerView_three.addItemDecoration(divider)
        //设置布局
        recyclerView_three.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_three.adapter = TextAndBitmaoListAdapter(this,listData)
    }
}
