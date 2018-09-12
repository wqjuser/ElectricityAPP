package com.wqj.baselibrary.ui.acctivity

import com.wqj.baselibrary.presenter.BasePreseenter
import com.wqj.baselibrary.presenter.view.BaseView

/**
 * @package com.wqj.baselibrary.ui.acctivity
 * @fileName BaseMvpActivity
 * @date on 2018/9/12 16:37
 * @author 温清洁
 * @describe TODO
 * @email wqjuser@gmail.com
 */
class BaseMvpActivity<T : BasePreseenter<*>> : BaseActivity(), BaseView {
    lateinit var mPresenter: T
    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }
}