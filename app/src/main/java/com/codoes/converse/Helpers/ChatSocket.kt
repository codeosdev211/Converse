package com.codoes.converse.Helpers

import android.content.Context
import android.util.Log
import okhttp3.*
import org.json.JSONObject

class ChatSocket(val context: Context): WebSocketListener() {

    val NORMAL_CLOSURE_STATUS = 106;
    var chatSocket: WebSocket? = null
    var client: OkHttpClient? = null

    init {
        client = OkHttpClient();
        var request: Request = Request.Builder().url("ws://192.168.1.11:8080/ws1?username=itadori2").build()
        chatSocket = client!!.newWebSocket(request, this)
        client!!.dispatcher().executorService().shutdown()

    }


    override fun onOpen(socket: WebSocket, response: Response) {
        socket.send("User connecting...");
    }

    override fun onMessage(socket: WebSocket, message: String) {
        Log.d("|*| message-> ", message)
    }

    override fun onClosing(socket: WebSocket, code: Int, reason: String) {
        socket.close(NORMAL_CLOSURE_STATUS, "Closing socket...")
        chatSocket!!.close(NORMAL_CLOSURE_STATUS, "Closing socket...")
    }

    override fun onFailure(socket: WebSocket, error: Throwable, response: Response?) {
        Log.d("|*| Error -> ", error.message.toString())
    }

    fun sendData(message:String) {
        var data: JSONObject = JSONObject()
        data.put("From", "User")
        data.put("To", "User")
        data.put("Type", "User")
        data.put("Message", message)
        chatSocket!!.send(data.toString())
    }

    fun close() {
        chatSocket!!.close(NORMAL_CLOSURE_STATUS, "Closing socket...")
    }
}