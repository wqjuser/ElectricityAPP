package com.wqj.usercenter.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.wqj.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mBtnRegister.setOnClickListener {
            toast("测试")
            intentFor<RegisterActivity>("id" to 5)
        }
    }
}
