package com.codoes.converse.Helpers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codoes.converse.Definitions.LayoutHolder
import org.json.JSONObject

/**
 * Author: Jayesh M (codeos)
 */
class GlobalAdp(val layoutId: Int, val layoutHolder: LayoutHolder): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var values: ArrayList<JSONObject>? = null // list of values to be displayed
    init {
        values = ArrayList<JSONObject>()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        // inflating the xml file
        val layout = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return layoutHolder.createHolder(layout)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // binding values to holder
        layoutHolder.bindHolder(holder, position)
    }

    override fun getItemCount(): Int {
        return values!!.size // returning size of values
    }

    fun loadData(values: ArrayList<JSONObject>) {
        this.values = values // copying the data to values list
    }
}
