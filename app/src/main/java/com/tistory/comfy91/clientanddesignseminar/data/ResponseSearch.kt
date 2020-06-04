package com.tistory.comfy91.clientanddesignseminar.data

data class ResponseSearch(
    val status : Int,
    val success : Boolean,
    val message : String,
    val data : SearchData?
)

data class SearchData(
    val tabname : Array<String>
)