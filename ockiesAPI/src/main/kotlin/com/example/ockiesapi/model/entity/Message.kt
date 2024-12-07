package com.example.ockiesapi.model.entity
import com.example.ockiesapi.enum.TypeEnum
import jakarta.persistence.*
import java.util.Date


@Entity
data class Message(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val messageId : Long? = null,
    val contenu : String? = null,
    val type : TypeEnum? = null,
    val horodatage : Date? = null,

    @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.EAGER)
    @JoinColumn(name = "conversation_id")
    var conversation: Conversation? = null
    )
