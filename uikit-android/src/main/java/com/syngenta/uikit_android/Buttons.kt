package com.syngenta.uikit_android

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

class CustomButton : Button {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
//...
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context, attrs,
        defStyleAttr
    ) {
        //...
    }
}