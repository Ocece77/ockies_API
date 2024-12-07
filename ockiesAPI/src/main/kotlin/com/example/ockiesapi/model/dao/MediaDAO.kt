package com.example.ockiesapi.model.dao

import com.example.ockiesapi.model.entity.Media
import org.springframework.data.jpa.repository.JpaRepository

abstract class MediaDAO: JpaRepository<Media, Long> {
}