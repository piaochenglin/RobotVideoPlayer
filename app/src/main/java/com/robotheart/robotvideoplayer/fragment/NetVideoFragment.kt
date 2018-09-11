package com.robotheart.robotvideoplayer.fragment

import android.util.Log
import com.robotheart.robotvideoplayer.R
import com.robotheart.robotvideoplayer.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_net_video.*


class NetVideoFragment : BaseFragment() {

    companion object {
        private const val mTAG: String = "NetVideoFragment"
    }

    override fun getLayoutId(): Int = R.layout.fragment_net_video

    override fun initView() {
        net_video_tv.setOnClickListener { net_video_tv.text = "我被改变了 网络视频" }
    }

    override fun initData() {
        net_video_tv.text = getString(R.string.home_net_video)
        Log.i(mTAG, "initial NetVideoFragment")
    }
}