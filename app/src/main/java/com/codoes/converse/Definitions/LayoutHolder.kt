package com.codoes.converse.Definitions

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Author: Jayesh M (codeos)
 */
interface LayoutHolder {
    // interface for using a single adapter multiple times
    fun createHolder(layout: View): RecyclerView.ViewHolder
    fun bindHolder(holder: RecyclerView.ViewHolder, position: Int)
}