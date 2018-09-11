package com.robotheart.robotvideoplayer.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.robotheart.robotvideoplayer.R
import com.robotheart.robotvideoplayer.fragment.AudioFragment
import com.robotheart.robotvideoplayer.fragment.NetAudioFragment
import com.robotheart.robotvideoplayer.fragment.NetVideoFragment
import com.robotheart.robotvideoplayer.fragment.VideoFragment
import kotlinx.android.synthetic.main.activity_home.*
import java.util.ArrayList

class HomeActivity : AppCompatActivity() {

    private val fragments = ArrayList<Fragment>()
    private var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        fragments.add(VideoFragment())
        fragments.add(AudioFragment())
        fragments.add(NetVideoFragment())
        fragments.add(NetAudioFragment())
        for (item in fragments){
            val ft = supportFragmentManager.beginTransaction()
            ft.add(R.id.home, item)
            ft.commit()
        }

        rg_tab.setOnCheckedChangeListener { _, checkedId ->
            position = when (checkedId) {
                R.id.rb_audio ->  1
                R.id.rb_net_video -> 2
                R.id.rb_net_audio -> 3
                else -> 0
            }
            setFragment()
        }
        rg_tab.check(R.id.rb_video)
    }

    private fun setFragment() {
        val ft = supportFragmentManager.beginTransaction()
        for (item in fragments){
            ft.hide(item)
        }
        when (position) {
            1 -> ft.show(fragments[1])
            2 -> ft.show(fragments[2])
            3 -> ft.show(fragments[3])
            else -> ft.show(fragments[0])
        }
        ft.commit()
    }
}
