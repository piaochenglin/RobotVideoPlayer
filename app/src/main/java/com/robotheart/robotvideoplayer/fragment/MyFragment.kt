package com.robotheart.robotvideoplayer.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.robotheart.robotvideoplayer.base.BasePage

class MyFragment : Fragment() {
    private var basePage: BasePage? = null



        fun newInstance(basePage: BasePage): MyFragment {
            val myFragment = MyFragment()
            val bundle = Bundle()
            this.basePage = basePage
            myFragment.arguments = bundle
            return myFragment
        }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (basePage != null) {
            var view :View = basePage!!.initView()
            basePage!!.initDate()
            return view
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}