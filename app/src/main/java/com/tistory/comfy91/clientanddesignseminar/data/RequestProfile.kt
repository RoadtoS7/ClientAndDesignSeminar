package com.tistory.comfy91.clientanddesignseminar.data

data class RequestProfile(
    val username : String,
    val levelimg : String?,
    val subscribe : String,
    val point : String,
    val favorites : String //배열
)