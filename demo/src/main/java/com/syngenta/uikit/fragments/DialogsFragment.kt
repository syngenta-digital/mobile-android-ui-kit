package com.syngenta.uikit.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.syngenta.uikit.R
import com.syngenta.uikit_android.CwDialog
import com.syngenta.uikit_android.DialogType
import kotlinx.android.synthetic.main.fragment_dialogs.*


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

        button_alert_dialog.setOnClickListener {
            displayAlertDialog()
        }

        button_primary_dialog.setOnClickListener {
            displayPrimaryDialog()
        }

        button_danger_dialog.setOnClickListener {
            displayDangerDialog()
        }
    }

    private fun displayAlertDialog() {
        val alertDialog = CwDialog(type = DialogType.Alert, context = context ?: return)

        alertDialog.setHeader("App update")
        alertDialog.setMessage("A new update will be available in 3 days.")
        alertDialog.setDismissButtonText("OK")
        alertDialog.setCancelable(false)
        alertDialog.setDismissButtonListener(View.OnClickListener {
            Toast.makeText(context, "Alert dismissed", Toast.LENGTH_SHORT).show()
            alertDialog.dismiss()
        })

        alertDialog.show()
    }

    private fun displayPrimaryDialog() {
        val primaryDialog = CwDialog(type = DialogType.Primary, context = context ?: return)

        primaryDialog.setHeader("Access Confirmation")
        primaryDialog.setMessage("Are you sure you want to give edit permission to John Doe?")
        primaryDialog.setProceedButtonText("Confirm")
        primaryDialog.setCancelable(false)
        primaryDialog.setProceedListener(View.OnClickListener {
            Toast.makeText(context, "Access Granted", Toast.LENGTH_SHORT).show()
            primaryDialog.dismiss()
        })
        primaryDialog.setDismissButtonListener(View.OnClickListener {
            Toast.makeText(context, "Action Cancelled", Toast.LENGTH_SHORT).show()
            primaryDialog.dismiss()
        })

        primaryDialog.show()
    }

    private fun displayDangerDialog() {
        val dangerDialog = CwDialog(type = DialogType.Danger, context = context ?: return)

        dangerDialog.setHeader("Delete Confirmation")
        dangerDialog.setMessage("Are you sure you want to delete 40 records?")
        dangerDialog.setProceedButtonText("Delete")
        dangerDialog.setCancelable(false)
        dangerDialog.setProceedListener(View.OnClickListener {
            Toast.makeText(context, "Records Deleted", Toast.LENGTH_SHORT).show()
            dangerDialog.dismiss()
        })
        dangerDialog.setDismissButtonListener(View.OnClickListener {
            Toast.makeText(context, "Action Cancelled", Toast.LENGTH_SHORT).show()
            dangerDialog.dismiss()
        })

        dangerDialog.show()
    }
}
