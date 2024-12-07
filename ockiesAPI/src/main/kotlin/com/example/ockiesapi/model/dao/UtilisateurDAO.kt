package com.example.ockiesapi.model.dao

import com.example.ockiesapi.model.entity.Utilisateur
import org.springframework.data.jpa.repository.JpaRepository

abstract class UtilisateurDAO : JpaRepository<Utilisateur, Long> {
}