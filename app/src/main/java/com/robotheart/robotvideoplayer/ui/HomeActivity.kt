package com.robotheart.robotvideoplayer.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.robotheart.robotvideoplayer.R
import com.robotheart.robotvideoplayer.listener.MyRadioChangeListener
import com.robotheart.robotvideoplayer.pages.AudioPage
import com.robotheart.robotvideoplayer.pages.NetAudioPage
import com.robotheart.robotvideoplayer.pages.NetVideoPage
import com.robotheart.robotvideoplayer.pages.VideoPage
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private var tabs = arrayListOf(VideoPage(this),AudioPage(this),NetVideoPage(this),NetAudioPage(this))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        rg_tab.setOnCheckedChangeListener(MyRadioChangeListener(tabs))
        rg_tab.check(R.id.rb_video)
    }
}
