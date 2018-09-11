package com.robotheart.robotvideoplayer.fragment

import android.util.Log
import com.robotheart.robotvideoplayer.R
import com.robotheart.robotvideoplayer.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_video.*

class VideoFragment : BaseFragment() {

    companion object {
        private const val mTAG: String = "VideoFragment"
    }

    override fun getLayoutId(): Int = R.layout.fragment_video

    override fun initData() {
        super.initData()
        video_tv.text = getString(R.string.home_video)
        Log.i(mTAG, "initial VideoFragment")
    }
}