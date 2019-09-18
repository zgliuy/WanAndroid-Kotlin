package com.xing.wanandroid.gank.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.xing.wanandroid.R
import com.xing.wanandroid.gank.bean.WxPublic

class WxPublicAdapter(layoutResId: Int) : BaseQuickAdapter<WxPublic, BaseViewHolder>(layoutResId) {

    override fun convert(helper: BaseViewHolder?, item: WxPublic?) {
        val name: String = item?.name ?: ""
        helper?.setText(R.id.tv_wx_author, name)
            ?.setText(R.id.tv_wx_author_icon, name.substring(0, 1))
    }
}