package com.example.ockiesapi.model.dao

import com.example.ockiesapi.model.entity.Conversation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.*

@Repository
abstract class ConversationDAO() : JpaRepository<Conversation, Long> {
}