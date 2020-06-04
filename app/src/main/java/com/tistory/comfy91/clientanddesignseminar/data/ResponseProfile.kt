package com.tistory.comfy91.clientanddesignseminar.data

import android.view.inspector.IntFlagMapping

data class ResponseProfile(
    val status : Int,
    val success : Boolean,
    val message : String,
    val data : ProfileData?
)
data class ProfileData(
    val username : String,
    val levelimg : String?,
    val subscribe : Int,
    val point : Int,
    val favorites : Array<String>
)