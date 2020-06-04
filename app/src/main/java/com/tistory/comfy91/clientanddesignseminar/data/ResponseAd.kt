package com.tistory.comfy91.clientanddesignseminar.data

data class ResponseAd(
    val status : Int,
    val success : Boolean,
    val message : String,
    val data : SomeData?
)

data class SomeData(
    val adimg : String?
)