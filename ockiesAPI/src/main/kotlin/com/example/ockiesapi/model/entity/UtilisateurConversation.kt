package com.example.ockiesapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "utilisateur_conversation")
data class UtilisateurConversation (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var utilisateurConversationId: String? = null,

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    var utilisateur: Utilisateur? = null,

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    var conversation: Conversation? = null
)
