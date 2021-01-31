package ru.skillbranch.sbdelivery.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.skillbranch.sbdelivery.R

abstract class BaseActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.ThemeSBDelivery)
        super.onCreate(savedInstanceState)
    }
}