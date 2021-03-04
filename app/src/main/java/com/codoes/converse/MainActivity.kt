package com.codoes.converse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.codoes.converse.Helpers.ChatSocket
import kotlinx.android.synthetic.main.activity_main.*

/**
 * author: jayesh m
 */
class MainActivity : AppCompatActivity() {
    var socket: ChatSocket? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        socket = ChatSocket(getApplicationContext())
        socket!!.sendData("1st mobile send message")
    }

    fun send(view: View) {
        socket!!.sendData(message.text.toString())
    }
}