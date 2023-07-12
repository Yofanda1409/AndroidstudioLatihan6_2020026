package com.example.latt6.app
import com.example.latt6.adapter.AdapterBarang
import com.example.latt6.model.ResponseModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.GET

interface ApiService {
    @FormUrlEncoded
    @POST("tblproduk/save")
    fun saveBarang(
        @Body data: AdapterBarang,

    ):Call<ResponseModel>
    @GET("obat")
    fun getBarang():Call<ResponseModel>
}