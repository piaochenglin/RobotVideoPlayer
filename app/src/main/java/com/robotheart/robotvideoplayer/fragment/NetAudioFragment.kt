package com.robotheart.robotvideoplayer.fragment

import android.util.Log
import com.robotheart.robotvideoplayer.R
import com.robotheart.robotvideoplayer.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_net_audio.*


class NetAudioFragment : BaseFragment(){
    companion object {

        private const val mTAG : String = "NetAudioFragment"
    }
    override fun getLayoutId(): Int = R.layout.fragment_net_audio

    override fun initView() {
        net_audio_tv.setOnClickListener { net_audio_tv.text = "我被改变了 网络音频" }
    }

    override fun initData() {
        net_audio_tv.text = getString(R.string.home_net_audio)
        Log.i(mTAG,"initial NetAudioFragment")
    }
}