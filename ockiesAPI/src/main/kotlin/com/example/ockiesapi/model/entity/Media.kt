package com.example.ockiesapi.model.entity

import jakarta.persistence.*

@Entity
class Media(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val mediaId : Long? = null,
    val lien : String? = null,

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    var utilisateur: Utilisateur? = null,
    ) {
}