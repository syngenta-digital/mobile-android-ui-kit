package com.syngenta.uikit_android

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.StateListDrawable
import android.util.AttributeSet
import android.widget.Button
import androidx.annotation.ColorInt
import androidx.core.graphics.ColorUtils

class StyledButton : Button {

    enum class ColorGroup {
        TEAL,
        ORANGE,
        RED,
        BLUE,
        YELLOW
    }

    enum class ButtonType {
        PRIMARY,
        SECONDARY,
        TERTIARY,
        TEXT
    }

    var colorGroup: Int = -1
    var type: Int = 3
    var overrideColor: Int = -1

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.StyledButton)
        colorGroup = typedArray.getInt(R.styleable.StyledButton_colorTheme, -1)
        type = typedArray.getInt(R.styleable.StyledButton_type, 3)
        overrideColor = typedArray.getColor(R.styleable.StyledButton_colorNew, -1)
        refreshTheme()
        typedArray.recycle()
    }

    fun setColorTheme(color: ColorGroup) {
        colorGroup = when (color) {
            ColorGroup.TEAL -> 0
            ColorGroup.ORANGE -> 1
            ColorGroup.RED -> 2
            ColorGroup.BLUE -> 3
            ColorGroup.YELLOW -> 4
        }
        refreshTheme()
    }

    fun setColorTheme(@ColorInt color: Int) {
        overrideColor = color
        refreshTheme()
    }

    fun setType(buttonType: ButtonType) {
        type = when (buttonType) {
            ButtonType.PRIMARY -> 0
            ButtonType.SECONDARY -> 1
            ButtonType.TERTIARY -> 2
            ButtonType.TEXT -> 3
        }
        refreshTheme()
    }

    private fun refreshTheme() {
        if (overrideColor != -1) {
            this.setTextColor(if (type == 0) resources.getColor(R.color.white) else overrideColor)
            this.background = getCustomBackground()
        } else {
            this.setTextColor(resources.getColor(getTextColor()))
            this.background = resources.getDrawable(getBackgroundRes())
        }
    }

    private fun getBackgroundRes(): Int {
        return when (colorGroup) {
            0 -> getTealTheme()
            1 -> getOrangeTheme()
            2 -> getRedTheme()
            3 -> getBlueTheme()
            4 -> getYellowTheme()
            else -> getTealTheme()
        }
    }

    private fun getTealTheme(): Int {
        return when (type) {
            0 -> R.drawable.bg_teal_primary
            1 -> R.drawable.bg_teal_secondary
            2 -> R.drawable.bg_teal_tertiary
            else -> R.drawable.bg_text
        }
    }

    private fun getOrangeTheme(): Int {
        return when (type) {
            0 -> R.drawable.bg_orange_primary
            1 -> R.drawable.bg_orange_secondary
            2 -> R.drawable.bg_orange_tertiary
            else -> R.drawable.bg_text
        }
    }

    private fun getRedTheme(): Int {
        return when (type) {
            0 -> R.drawable.bg_red_primary
            1 -> R.drawable.bg_red_secondary
            2 -> R.drawable.bg_red_tertiary
            else -> R.drawable.bg_text
        }
    }

    private fun getBlueTheme(): Int {
        return when (type) {
            0 -> R.drawable.bg_blue_primary
            1 -> R.drawable.bg_blue_secondary
            2 -> R.drawable.bg_blue_tertiary
            else -> R.drawable.bg_text
        }
    }

    private fun getYellowTheme(): Int {
        return when (type) {
            0 -> R.drawable.bg_yellow_primary
            1 -> R.drawable.bg_yellow_secondary
            2 -> R.drawable.bg_yellow_tertiary
            else -> R.drawable.bg_text
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


    private fun getCustomBackground(): Drawable {
        val defaultState = GradientDrawable()
        defaultState.cornerRadius = 10f

        val pressedState = GradientDrawable()
        pressedState.cornerRadius = 10f

        when (type) {
            0 -> {
                defaultState.setColor(overrideColor)
                pressedState.setColor(getPrimaryPressedShade())
            }
            1 -> {
                defaultState.setColor(getSecondaryDefaultShade())
                pressedState.setColor(getSecondaryPressedShade())
            }
            2 -> {
                defaultState.setStroke(3, overrideColor)
                pressedState.setStroke(3, overrideColor)
                defaultState.setColor(resources.getColor(R.color.white))
                pressedState.setColor(resources.getColor(R.color.neutral_500))
            }
            else -> {
                defaultState.setColor(resources.getColor(R.color.white))
                pressedState.setColor(resources.getColor(R.color.neutral_500))
            }
        }

        val states = StateListDrawable()
        states.addState(intArrayOf(-android.R.attr.state_enabled), defaultState)
        states.addState(intArrayOf(android.R.attr.state_pressed), pressedState)
        return states
    }

    private fun getPrimaryPressedShade(): Int {
        val hsv = FloatArray(3)
        Color.colorToHSV(overrideColor, hsv)
        hsv[2] *= 0.7f
        return Color.HSVToColor(hsv)
    }

    private fun getSecondaryPressedShade(): Int {
        return ColorUtils.setAlphaComponent(overrideColor, 64)
    }

    private fun getSecondaryDefaultShade(): Int {
        return ColorUtils.setAlphaComponent(overrideColor, 16)
    }
}