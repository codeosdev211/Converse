package com.codoes.converse.Helpers

import android.content.Context
import com.codoes.converse.Definitions.LoadRes

/**
 * Author: Jayesh M
 */
class Connect(val context: Context, val pageName: String) {

    private var baseURL: String = "http://localhost:9000"

    private fun getPageURL(): String {
        when(pageName) {
            "SignUp" -> return baseURL + "/CU/AU"
            else -> return baseURL
        }
    }

    fun send(values: ArrayList<Any>, loadRes: LoadRes) {
    }


}