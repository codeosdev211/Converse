package com.codoes.converse.Helpers

import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener

class Notifsocket: WebSocketListener() {

    val NORMAL_CLOSURE_STATUS = 106;

    override fun onOpen(socket: WebSocket, response: Response) {
        socket.send("User connecting...");
    }

    override fun onMessage(socket: WebSocket, message: String) {

    }

    override fun onClosing(socket: WebSocket, code: Int, reason: String) {
        socket.close(NORMAL_CLOSURE_STATUS, "Closing socket...")
    }

    override fun onFailure(socket: WebSocket, error: Throwable, response: Response?) {

    }
}