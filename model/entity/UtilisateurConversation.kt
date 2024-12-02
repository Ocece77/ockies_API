package com.example.ockiesaapi.model.entity

import Conversation
import Utilisateur
import jakarta.persistence.*

@Entity
@Table(name = "utilisateur_conversation")
class UtilisateurConversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "fk_utilisateur_id")
    var utilisateur: Utilisateur? = null,

    @OneToMany
    @JoinColumn(name = "fk_conversation_id")
    var conversations: MutableSet<Conversation> = HashSet()

}