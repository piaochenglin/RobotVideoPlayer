package com.robotheart.robotvideoplayer.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.MotionEvent
import com.robotheart.robotvideoplayer.R

class SplashActivity : AppCompatActivity() {
    private var isStartedHomeActivity: Boolean = false
    private val tag = "SplashActivity"
    private val handler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        handler.postDelayed({ startHomeActivity() }, 3000)
    }

    private fun startHomeActivity() {
        if (!isStartedHomeActivity) {
            isStartedHomeActivity = true
            val intent = Intent()
            intent.setClass(this, HomeActivity::class.java)
            startActivity(intent)
            Log.i(tag,"touch event start HomeActivity" )
            finish()
        }
    }

    override fun onDestroy() {
        handler.removeCallbacksAndMessages(null)
        super.onDestroy()
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.i(tag, "touch event===" + event!!.action)
        startHomeActivity()
        return super.onTouchEvent(event)
    }
}
