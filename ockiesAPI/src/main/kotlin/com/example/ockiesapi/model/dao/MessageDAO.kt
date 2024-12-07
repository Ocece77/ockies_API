package com.example.ockiesapi.model.dao

import com.example.ockiesapi.model.entity.Message
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
abstract class MessageDAO:  JpaRepository<Message, Long>{
}