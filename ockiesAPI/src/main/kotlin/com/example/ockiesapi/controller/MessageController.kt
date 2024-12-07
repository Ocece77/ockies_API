package com.example.ockiesapi.controller

import com.example.ockiesapi.enum.TypeEnum
import com.example.ockiesapi.model.entity.Conversation
import java.util.*

class MessageController(
    val messageId : Long? ,
    val contenu : String?,
    val type : TypeEnum?,
    val horodatage : Date? ,
    var conversation: Conversation?
) {
}