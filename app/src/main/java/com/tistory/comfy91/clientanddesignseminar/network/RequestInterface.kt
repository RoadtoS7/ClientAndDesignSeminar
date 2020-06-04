package com.tistory.comfy91.clientanddesignseminar.network

import com.tistory.comfy91.clientanddesignseminar.data.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RequestInterface {
    @GET("/main/ad")
    fun requestAd (@Body body:RequestAd) : Call<ResponseAd>

    @POST("/main/profile/{username}")
    fun requestProfile (@Body body : RequestProfile) : Call<ResponseProfile>

    @GET("/search/keyword")
    fun requestSearch (@Body body : RequestSearch) : Call<ResponseSearch>
}