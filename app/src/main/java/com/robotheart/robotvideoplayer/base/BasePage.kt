package com.robotheart.robotvideoplayer.base

import android.content.Context
import android.view.View

abstract class BasePage(context: Context) {
    var context : Context? = context

    abstract fun initView(): View

    open fun initDate() {

    }

}