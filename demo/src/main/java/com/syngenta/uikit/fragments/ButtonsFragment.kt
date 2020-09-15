package com.syngenta.uikit.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.syngenta.uikit.R
import kotlinx.android.synthetic.main.fragment_buttons.*

class ButtonsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buttons, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
        }
        disable_switch.isChecked = true

        disable_switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                enableButtons()
            } else {
                disableButtons()
            }
        }
    }

    private fun enableButtons() {
        primarySolidButton.isEnabled = true
        defaultSolidButton.isEnabled = true
        dangerSolidButton.isEnabled = true
        primaryGhostButton.isEnabled = true
        dangerGhostButton.isEnabled = true
    }

    private fun disableButtons() {
        primarySolidButton.isEnabled = false
        defaultSolidButton.isEnabled = false
        dangerSolidButton.isEnabled = false
        primaryGhostButton.isEnabled = false
        dangerGhostButton.isEnabled = false
    }

}
