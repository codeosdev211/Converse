package com.codoes.converse.Helpers

import android.content.Context
import android.graphics.Color
import android.os.Build
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codoes.converse.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * Author: Jayesh M (codeos)
 */
class Components(val context: Context, val parent: View) {

    /* this enum is used to define the position of button
    * so, if FULL then width = match_parent else wrap_content*/
    enum class ButtonType {
        LEFT, FULL, RIGHT
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun defaultEditText(id: Int, hint: String, isAtTop: Boolean): EditText {
        var temp: EditText = parent.findViewById(id);
        temp.isSingleLine = true;
        temp.hint = hint;
        temp.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F);
        temp.setHintTextColor(Color.GRAY);
        temp.setTextColor(R.color.main_dark)
        temp.gravity = Gravity.CENTER_VERTICAL
        temp.setPadding(30, 0, 0, 30)
        temp.backgroundTintList = ContextCompat.getColorStateList(
            context, R.color.main_dark);
        var params: ViewGroup.MarginLayoutParams = temp.layoutParams as ViewGroup.MarginLayoutParams
        params.width = ViewGroup.LayoutParams.MATCH_PARENT
        params.height = 120
        var topMargin = if (isAtTop) 80 else 40
        params.setMargins(40, topMargin, 40, 0)
        temp.layoutParams = params
        return temp
    }

    fun defaultTextView(id: Int, text: String, gravity: Int, size: Float): TextView {
        var temp: TextView = parent.findViewById(id);
        temp.text = text
        temp.setTextColor(R.color.main_dark)
        temp.setTextSize(TypedValue.COMPLEX_UNIT_SP, size)
        temp.gravity = gravity
        temp.setPadding(0, 0, 0, 0)
        var params: ViewGroup.MarginLayoutParams = temp.layoutParams as ViewGroup.MarginLayoutParams
        params.width = ViewGroup.LayoutParams.MATCH_PARENT
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT
        params.setMargins(40, 40, 40, 0)
        temp.layoutParams = params
        return temp
    }

    fun defaultButton(id: Int, text: String, type: ButtonType): Button {
        var temp: Button = parent.findViewById(id)
        temp.text = text
        temp.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14F)
        temp.setTextColor(Color.WHITE);
        temp.setPadding(0, 0, 0, 0)
        var params: ViewGroup.MarginLayoutParams = temp.layoutParams as ViewGroup.MarginLayoutParams
        when (type) {
            ButtonType.FULL -> {
                params.width = ViewGroup.LayoutParams.MATCH_PARENT
                params.height = ViewGroup.LayoutParams.WRAP_CONTENT
            }
            else -> {
                params.width = ViewGroup.LayoutParams.WRAP_CONTENT
                params.height = ViewGroup.LayoutParams.WRAP_CONTENT
            }
        }
        params.setMargins(50, 50, 50, 0)
        temp.setBackgroundResource(R.drawable.button_layout)
        temp.elevation = 8f
        temp.layoutParams = params
        return temp
    }

    fun defaultImageButton(id: Int): ImageButton {
        var temp: ImageButton = parent.findViewById(id)
        temp.setBackgroundColor(Color.TRANSPARENT)
        var params: ViewGroup.MarginLayoutParams = temp.layoutParams as ViewGroup.MarginLayoutParams
        params.width = ViewGroup.LayoutParams.WRAP_CONTENT
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT
        params.setMargins(0, 0, 0, 0)
        temp.layoutParams = params
        return temp
    }

    fun defaultFAB(id: Int, bgColor: Int, srcImage: Int): FloatingActionButton  {
        var temp: FloatingActionButton = parent.findViewById(id)
        temp.elevation = 16f
        temp.setImageResource(srcImage)
        temp.backgroundTintList = ContextCompat.getColorStateList(context, bgColor)
        var params: ViewGroup.MarginLayoutParams = temp.layoutParams as ViewGroup.MarginLayoutParams
        params.width = ViewGroup.LayoutParams.WRAP_CONTENT
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT
        params.setMargins(0, 0, 0, 0);
        temp.layoutParams = params
        return temp
    }

    fun defaultRV(id: Int): RecyclerView {
        var temp: RecyclerView = parent.findViewById(id)
        temp.layoutManager = LinearLayoutManager(context)
        temp.setPadding(0, 20, 0, 10)
        var params: ViewGroup.MarginLayoutParams = temp.layoutParams as ViewGroup.MarginLayoutParams
        params.width = ViewGroup.LayoutParams.MATCH_PARENT
        params.height = 0;
        params.setMargins(0, 20, 0, 0)
        temp.layoutParams = params
        return temp
    }

    fun defaultCheckBox(id: Int, text: String): CheckBox {
        var temp: CheckBox = parent.findViewById(id)
        temp.text = text
        temp.setTextColor(Color.WHITE)
        temp.isChecked = false
        var params: ViewGroup.MarginLayoutParams = temp.layoutParams as ViewGroup.MarginLayoutParams
        params.width = ViewGroup.LayoutParams.MATCH_PARENT
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT
        params.setMargins(20, 20, 20, 0)
        temp.layoutParams = params
        return temp
    }







}