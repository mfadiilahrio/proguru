package com.proguru.android.extension

import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import com.proguru.android.R

fun AppCompatActivity.showBackButton(@DrawableRes icon: Int = R.drawable.ic_baseline_arrow_back_ios) {

    supportActionBar?.setDisplayShowHomeEnabled(true)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)

    supportActionBar?.setHomeAsUpIndicator(icon)
}