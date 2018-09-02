package com.robotheart.robotvideoplayer.pages

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.robotheart.robotvideoplayer.base.BasePage

class VideoPage(context: Context) : BasePage(context) {

    private val tag: String = "VideoPage"
    private var tv: TextView? =null

    override fun initView(): View {
        Log.i(tag, "本地视频页面初始化了...")
        tv = TextView(context)
        tv!!.textSize = 30f
        tv!!.setTextColor(Color.RED)
        tv!!.gravity = Gravity.CENTER
        return tv!!
    }

    override fun initDate() {
        super.initDate()
        Log.i(tag, "本地视频数据初始化了...")
        tv!!.text="本地视频页面"
    }
}