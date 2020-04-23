package com.syngenta.uikit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.syngenta.uikit_android.StyledButton
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectTeal.setOnClickListener {
            clearAllChecks()
            selectTeal.setImageResource(R.drawable.ic_check)
            setButtonColor(StyledButton.ColorGroup.TEAL)
        }

        selectBlue.setOnClickListener {
            clearAllChecks()
            selectBlue.setImageResource(R.drawable.ic_check)
            setButtonColor(StyledButton.ColorGroup.BLUE)
        }

        selectYellow.setOnClickListener {
            clearAllChecks()
            selectYellow.setImageResource(R.drawable.ic_check)
            setButtonColor(StyledButton.ColorGroup.YELLOW)
        }

        selectRed.setOnClickListener {
            clearAllChecks()
            selectRed.setImageResource(R.drawable.ic_check)
            setButtonColor(StyledButton.ColorGroup.RED)
        }

        selectOrange.setOnClickListener {
            clearAllChecks()
            selectOrange.setImageResource(R.drawable.ic_check)
            setButtonColor(StyledButton.ColorGroup.ORANGE)
        }
    }

    private fun setButtonColor(color: StyledButton.ColorGroup) {
        primaryButton.setAccentColor(color)
        secondaryButton.setAccentColor(color)
        tertiaryButton.setAccentColor(color)
        textButton.setAccentColor(color)
    }

    private fun clearAllChecks() {
        selectTeal.setImageResource(android.R.color.transparent)
        selectBlue.setImageResource(android.R.color.transparent)
        selectYellow.setImageResource(android.R.color.transparent)
        selectRed.setImageResource(android.R.color.transparent)
        selectOrange.setImageResource(android.R.color.transparent)
    }
}
