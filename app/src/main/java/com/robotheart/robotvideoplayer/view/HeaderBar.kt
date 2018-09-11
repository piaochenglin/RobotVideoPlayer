package com.robotheart.robotvideoplayer.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import com.robotheart.robotvideoplayer.R
import kotlinx.android.synthetic.main.header.view.*

class HeaderBar : LinearLayout ,View.OnClickListener{

    constructor (context: Context?) : this(context, null)

    constructor (context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onFinishInflate() {
        super.onFinishInflate()
        header_tv_search.setOnClickListener(this)
        header_rl_game.setOnClickListener(this)
        header_history_image.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.header_tv_search -> Toast.makeText(context,"搜索",Toast.LENGTH_SHORT).show()
            R.id.header_rl_game -> Toast.makeText(context,"游戏",Toast.LENGTH_SHORT).show()
            R.id.header_history_image -> Toast.makeText(context,"历史",Toast.LENGTH_SHORT).show()
        }
    }
}
