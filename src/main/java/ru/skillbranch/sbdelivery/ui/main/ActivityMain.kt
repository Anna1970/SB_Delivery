package ru.skillbranch.sbdelivery.ui.main

import android.os.Bundle
import ru.skillbranch.sbdelivery.R
import ru.skillbranch.sbdelivery.ui.base.BaseActivity


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}