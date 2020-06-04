package com.tistory.comfy91.clientanddesignseminar.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RequestToServer{
    var retrofit = Retrofit.Builder()
        .baseUrl("http://:3333") //아직 못받음
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: RequestInterface = retrofit.create(
        RequestInterface::class.java)
}