package com.robotheart.robotvideoplayer.fragment


import android.util.Log
import com.robotheart.robotvideoplayer.R
import com.robotheart.robotvideoplayer.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_audio.*


class AudioFragment : BaseFragment() {

    companion object {
        private const val mTAG: String = "AudioFragment"
    }

    override fun getLayoutId(): Int = R.layout.fragment_audio

    override fun initData() {
        super.initData()
        audio_not_found_tv.text = getString(R.string.home_audio)
        Log.i(mTAG, "initial AudioFragment")
    }
}