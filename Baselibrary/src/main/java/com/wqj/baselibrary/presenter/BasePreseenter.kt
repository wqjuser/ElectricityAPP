package com.wqj.baselibrary.presenter

import com.wqj.baselibrary.presenter.view.BaseView

/**
 * @package com.wqj.baselibrary.presenter
 * @fileName BasePreseenter
 * @date on 2018/9/12 16:34
 * @author 温清洁
 * @describe TODO
 * @email wqjuser@gmail.com
 */
class BasePreseenter<T : BaseView> {
    lateinit var mView: T
}