package com.syngenta.uikit.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.syngenta.uikit.MainActivity
import com.syngenta.uikit.R
import com.syngenta.uikit_android.ColorGroup
import kotlinx.android.synthetic.main.fragment_buttons.*

class ButtonsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buttons, container, false)
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).setTitle(getString(R.string.buttons))
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        selectTeal.setOnClickListener {
            clearAllChecks()
            selectTeal.setImageResource(R.drawable.ic_check)
            setButtonColor(ColorGroup.TEAL)
        }

        selectBlue.setOnClickListener {
            clearAllChecks()
            selectBlue.setImageResource(R.drawable.ic_check)
            setButtonColor(ColorGroup.BLUE)
        }

        selectYellow.setOnClickListener {
            clearAllChecks()
            selectYellow.setImageResource(R.drawable.ic_check)
            setButtonColor(ColorGroup.YELLOW)
        }

        selectRed.setOnClickListener {
            clearAllChecks()
            selectRed.setImageResource(R.drawable.ic_check)
            setButtonColor(ColorGroup.RED)
        }

        selectOrange.setOnClickListener {
            clearAllChecks()
            selectOrange.setImageResource(R.drawable.ic_check)
            setButtonColor(ColorGroup.ORANGE)
        }
    }

    private fun setButtonColor(color: ColorGroup) {
        primaryButton.setColorTheme(color)
        secondaryButton.setColorTheme(color)
        tertiaryButton.setColorTheme(color)
        textButton.setColorTheme(color)
    }

    private fun clearAllChecks() {
        selectTeal.setImageResource(android.R.color.transparent)
        selectBlue.setImageResource(android.R.color.transparent)
        selectYellow.setImageResource(android.R.color.transparent)
        selectRed.setImageResource(android.R.color.transparent)
        selectOrange.setImageResource(android.R.color.transparent)
    }

}
