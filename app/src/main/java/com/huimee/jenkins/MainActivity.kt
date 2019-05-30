package com.huimee.jenkins

import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        but.text = BuildConfig.text
        but2.text = BuildConfig.num.toString()

        val mPackageManager = this.packageManager
        val info = mPackageManager.getPackageInfo(this.packageName, 0)

        but3.text = info.packageName

    }


}
