package com.syngenta.uikit.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.syngenta.uikit.R
import kotlinx.android.synthetic.main.fragment_dialogs.*
import kotlinx.android.synthetic.main.fragment_dialogs.toolbar


class DialogsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dialogs, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
        }

        button_show_dialog.setOnClickListener {
            displayDialog()
        }
    }

    private fun displayDialog() {
//        val styledDialog = StyledDialog(context ?: return)
//
//        styledDialog.setHeader("Confirm access to user")
//
//        styledDialog.setMessage("Are your sure you want to give access to User 4?")
//
//        styledDialog.setPositiveButtonText("Yes")
//
//        styledDialog.setCancelable(false)
//
//        styledDialog.setPositiveListener(View.OnClickListener {
//            Toast.makeText(
//                context,
//                "Access Granted!",
//                Toast.LENGTH_SHORT
//            ).show()
//            styledDialog.dismiss()
//        })
//
//        styledDialog.setColorTheme(ColorGroup.TEAL)
//
//        styledDialog.show()
    }
}
