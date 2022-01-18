package com.example.myowncustomizesdk

import android.content.Context
import android.view.View
import android.widget.RelativeLayout

class MyLayout(context: Context?) : RelativeLayout(context) {
    override fun addView(child: View?) {
        super.addView(child)
    }

    override fun setAddStatesFromChildren(addsStates: Boolean) {
        super.setAddStatesFromChildren(addsStates)
    }

    override fun setPadding(left: Int, top: Int, right: Int, bottom: Int) {
        super.setPadding(left, top, right, bottom)
    }
}