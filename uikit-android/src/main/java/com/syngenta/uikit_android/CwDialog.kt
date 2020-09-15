package com.syngenta.uikit_android

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.cw_dialog.view.*

enum class DialogType {
    Alert,
    Primary,
    Danger
}

class CwDialog(
    context: Context,
    var type: DialogType = DialogType.Primary,
    title: String? = null,
    message: String? = null,
    proceedButtonText: String? = null,
    dismissButtonText: String? = null
) {
    private var dialog: AlertDialog
    private var dialogView: View

    init {
        val builder = AlertDialog.Builder(context)
        val inflater = LayoutInflater.from(context)
        dialogView = inflater.inflate(R.layout.cw_dialog, null)
        builder.setView(dialogView)
        dialog = builder.create()

        if (title != null) {
            dialogView.text_heading.text = title
        } else {
            dialogView.text_heading.visibility = View.GONE
        }

        if (message != null) {
            dialogView.text_message.text = message
        } else {
            dialogView.text_message.visibility = View.GONE
        }

        dialogView.button_cancel.text = dismissButtonText ?: "Cancel"
        dialogView.button_cancel.setOnClickListener {
            dialog.dismiss()
        }

        when (type) {
            DialogType.Alert -> {
                dialogView.button_primary.visibility = View.GONE
                dialogView.button_danger.visibility = View.GONE
            }
            DialogType.Primary -> {
                dialogView.button_primary.visibility = View.VISIBLE
                dialogView.button_danger.visibility = View.GONE
                dialogView.button_primary.text = proceedButtonText ?: "OK"
            }
            DialogType.Danger -> {
                dialogView.button_primary.visibility = View.GONE
                dialogView.button_danger.visibility = View.VISIBLE
                dialogView.button_danger.text = proceedButtonText ?: "OK"
            }
        }

    }

    fun show() {
        dialog.show()
    }

    fun dismiss() {
        dialog.dismiss()
    }

    fun setHeader(header: String) {
        dialogView.text_heading.visibility = View.VISIBLE
        dialogView.text_heading.text = header
    }

    fun setMessage(message: String) {
        dialogView.text_message.visibility = View.VISIBLE
        dialogView.text_message.text = message
    }

    fun setProceedButtonText(text: String) {
        if (type == DialogType.Primary) {
            dialogView.button_primary.text = text
        } else {
            dialogView.button_danger.text = text
        }
    }

    fun setProceedListener(listener: View.OnClickListener) {
        if (type == DialogType.Primary) {
            dialogView.button_primary.setOnClickListener(listener)
        } else {
            dialogView.button_danger.setOnClickListener(listener)
        }
    }

    fun setDismissButtonText(text: String) {
        dialogView.button_cancel.text = text
    }

    fun setDismissButtonListener(listener: View.OnClickListener) {
        dialogView.button_cancel.setOnClickListener(listener)
    }

    fun setCancelable(cancelable: Boolean) {
        dialog.setCancelable(cancelable)
    }
}