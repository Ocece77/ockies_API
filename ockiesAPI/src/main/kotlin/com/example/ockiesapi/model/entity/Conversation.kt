package com.example.ockiesapi.model.entity

import com.example.ockiesapi.enum.ConversationType
import jakarta.persistence.*

@Entity
class Conversation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val conversationId : Long? = null,
    val type : ConversationType? = null,
) {
}