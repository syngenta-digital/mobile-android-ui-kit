package com.syngenta.uikit_android

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.Button

class StyledButton : Button {

    var colorGroup: Int = 0
    var type: Int = 0

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.StyledButton)

        colorGroup = typedArray.getInt(R.styleable.StyledButton_primaryColor, 0)
        type = typedArray.getInt(R.styleable.StyledButton_type, 0)
        this.setTextColor(resources.getColor(getTextColor(), null))
        this.setBackgroundColor(resources.getColor(getBackgroundColor(), null))
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                this.setBackgroundColor(resources.getColor(getPressedColor(), null))
            }

            MotionEvent.ACTION_UP -> {
                this.setBackgroundColor(resources.getColor(getBackgroundColor(), null))
            }
        }
        return super.onTouchEvent(event)
    }

    private fun getBackgroundColor(): Int {
        return when (colorGroup) {
            0 -> R.color.teal_500
            1 -> R.color.orange_500
            2 -> R.color.red_500
            3 -> R.color.blue_500
            4 -> R.color.yellow_500
            else -> R.color.teal_500
        }
    }

    private fun getPressedColor(): Int {
        return when (colorGroup) {
            0 -> R.color.teal_700
            1 -> R.color.orange_700
            2 -> R.color.red_700
            3 -> R.color.blue_700
            4 -> R.color.yellow_700
            else -> R.color.teal_700
        }
    }

    private fun getTextColor(): Int {
        if (type == 0) {
            return R.color.white
        }
        return when (colorGroup) {
            0 -> R.color.teal_500
            1 -> R.color.orange_500
            2 -> R.color.red_500
            3 -> R.color.blue_500
            4 -> R.color.yellow_500
            else -> R.color.teal_500
        }
    }
}