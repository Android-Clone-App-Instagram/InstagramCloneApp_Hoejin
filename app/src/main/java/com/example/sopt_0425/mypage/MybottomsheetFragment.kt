package com.example.sopt_0425.mypage


import android.app.Dialog
import androidx.fragment.app.Fragment
import android.view.View

import com.example.sopt_0425.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * A simple [Fragment] subclass.
 */
class MybottomsheetFragment : BottomSheetDialogFragment() {

    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)
        val contentView = View.inflate(context, R.layout.fragment_mybottomsheet, null)
        dialog?.setContentView(contentView)
    }
}
