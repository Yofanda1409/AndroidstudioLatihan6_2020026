package com.example.latt6.app

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.sql.Time
import java.util.Base64
import java.util.concurrent.TimeUnit
import com.example.latt6.util.Config

object ApiConfig {
    private const val BASE_URL=com.example.latt6.util.Config.baseUrl+ "api/"
            private val client: Retrofit
            get(){
                val gson =GsonBuilder()
                    .setLenient()
                    .create()
                val interceptor =HttpLoggingInterceptor()
                interceptor.level =HttpLoggingInterceptor.Level.BODY
                val client: OkHttpClient = OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .connectTimeout(50,TimeUnit.SECONDS)
                    .readTimeout(50,TimeUnit.SECONDS)
                    .writeTimeout(50,TimeUnit.SECONDS)
                    .build()
                return Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(client)
                    .build()

            }
    val instranceRetrofit: ApiService
    get() = client.create(ApiService::class.java)
}