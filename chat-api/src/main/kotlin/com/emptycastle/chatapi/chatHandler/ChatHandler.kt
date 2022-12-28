package com.emptycastle.chatapi.chatHandler

import mu.KotlinLogging
import org.springframework.stereotype.Component
import org.springframework.web.socket.CloseStatus
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler

@Component
class ChatHandler: TextWebSocketHandler() {

    companion object {
        private val list: MutableList<WebSocketSession> = mutableListOf()
        private val logger = KotlinLogging.logger {  }
    }

    override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        val payload = message.payload
        logger.info { "payload : $payload" }

        list.forEach { it.sendMessage(message) }
    }

    override fun afterConnectionEstablished(session: WebSocketSession) {
        list.add(session)
        logger.info { "$session 클라이언트 접속" }
    }

    override fun afterConnectionClosed(session: WebSocketSession, status: CloseStatus) {
        logger.info { "$session 클라이언트 접속 해제" }
        list.remove(session)
    }
}