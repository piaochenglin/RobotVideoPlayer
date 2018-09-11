package com.robotheart.robotvideoplayer.base


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment : Fragment() {
    companion object {
        private const val mTag = "BaseFragment"
    }

    private var hasLoadedData = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutId(), null)
    }

    abstract fun getLayoutId(): Int

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()
        if (!hasLoadedData) {
            initData()
            hasLoadedData = true
        }
    }

    open fun initView() {}

    open fun initData() {
        Log.i(mTag, "this base fragment")
    }
}
