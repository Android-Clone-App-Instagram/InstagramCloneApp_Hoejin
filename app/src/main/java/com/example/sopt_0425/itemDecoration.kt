package com.example.sopt_0425

import androidx.recyclerview.widget.RecyclerView
import android.graphics.Rect
import android.view.View


public class ItemDecoration : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.left = 5
        outRect.right = 5
        outRect.top = 10
    }
}