package com.syngenta.uikit_android

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.ColorInt
import kotlinx.android.synthetic.main.styled_dialog.view.*


class StyledDialog(
    context: Context,
    heading: String? = null,
    message: String? = null,
    positiveButtonText: String? = null,
    dismissButtonText: String? = null
) {
    private var dialog: AlertDialog
    private var dialogView: View

    init {
        val builder = AlertDialog.Builder(context)
        val inflater = LayoutInflater.from(context)
        dialogView = inflater.inflate(R.layout.styled_dialog, null)
        builder.setView(dialogView)
        dialog = builder.create()

        if (heading != null) {
            dialogView.text_heading.text = heading
        } else {
            dialogView.text_heading.visibility = View.GONE
        }

        if (message != null) {
            dialogView.text_message.text = message
        } else {
            dialogView.text_message.visibility = View.GONE
        }
        dialogView.button_positive.text = positiveButtonText ?: "OK"
        dialogView.button_cancel.text = dismissButtonText ?: "Cancel"
        dialogView.button_cancel.setOnClickListener {
            dialog.dismiss()
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

    fun setPositiveButtonText(text: String) {
        dialogView.button_positive.text = text
    }

    fun setDismissButtonText(text: String) {
        dialogView.button_cancel.text = text
    }

    fun setPositiveListener(listener: View.OnClickListener) {
        dialogView.button_positive.setOnClickListener(listener)
    }

    fun setDismissButtonListener(listener: View.OnClickListener) {
        dialogView.button_cancel.setOnClickListener(listener)
    }

    fun setCancelable(cancelable: Boolean) {
        dialog.setCancelable(cancelable)
    }

    fun setColorTheme(color: ColorGroup) {
        dialogView.button_positive.setColorTheme(color)
        dialogView.button_cancel.setColorTheme(color)
    }

    fun setColorTheme(@ColorInt color: Int) {
        dialogView.button_positive.setColorTheme(color)
        dialogView.button_cancel.setColorTheme(color)
    }
}