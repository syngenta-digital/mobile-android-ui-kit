package com.syngenta.uikit.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.syngenta.uikit.MainActivity
import com.syngenta.uikit.R
import com.syngenta.uikit_android.ColorGroup
import com.syngenta.uikit_android.StyledDialog
import kotlinx.android.synthetic.main.fragment_dialogs.*


class DialogsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dialogs, container, false)
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).setTitle(getString(R.string.dialogs))
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        button_show_dialog.setOnClickListener {
            displayDialog()
        }
    }

    private fun displayDialog() {
        val styledDialog = StyledDialog(context!!)
        styledDialog.setHeader("Confirm access to user")
        styledDialog.setMessage("Are your sure you want to give access to User 4?")
        styledDialog.setPositiveButtonText("Yes")
        styledDialog.setCancelable(false)
        styledDialog.setPositiveListener(View.OnClickListener {
            Toast.makeText(
                context,
                "Access Granted!",
                Toast.LENGTH_SHORT
            ).show()
            styledDialog.dismiss()
        })
        styledDialog.setColorTheme(resources.getColor(R.color.colorAccent))
        styledDialog.show()
    }
}
