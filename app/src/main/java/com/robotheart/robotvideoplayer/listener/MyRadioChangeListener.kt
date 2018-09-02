package com.robotheart.robotvideoplayer.listener

import android.annotation.SuppressLint
import android.support.v4.app.FragmentActivity
import android.widget.RadioGroup
import com.robotheart.robotvideoplayer.R
import com.robotheart.robotvideoplayer.base.BasePage
import com.robotheart.robotvideoplayer.fragment.MyFragment

@SuppressLint("Registered")
class MyRadioChangeListener(private val list: List<BasePage>) : RadioGroup.OnCheckedChangeListener, FragmentActivity() {

    private var position: Int = 0


    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        position = when (checkedId) {
            R.id.rb_audio -> 1
            R.id.rb_net_video -> 2
            R.id.rb_net_audio -> 3
            else -> 0
        }
        setFragment()
    }

    private fun setFragment() {
        //得到fragment manager
        //开启事务
        val ft = supportFragmentManager.beginTransaction()
        //替换
        ft.replace(R.id.home, MyFragment().newInstance(getBasePage()))
        //提交事务
        ft.commit()
    }


    private fun getBasePage(): BasePage = list[position]
}