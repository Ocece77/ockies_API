package com.example.ockiesapi.dto

import com.example.ockiesapi.model.entity.Utilisateur


class MediaDTO(
    val mediaId : Long? ,
    val lien : String? = null,
    var utilisateur: Utilisateur?,
) {
}