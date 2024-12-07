package com.example.ockiesapi.model.entity

import jakarta.persistence.*

@Entity
data class Utilisateur (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var utilisateurId: String? = null,

    var avatar : String? = null,
    var nom : String? = null,
    var statut : String? = null,
    var etatenligne : Int? =null
)