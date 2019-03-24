package com.example.exchangerate

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface Service{
    //http://data.fixer.io/api/latest?access_key=2f6b656e67de6289bd4d26a3c19fce3b&symbols=RUB,USD&date=2013-12-24
    @GET("latest")
    fun getLatest(
        @Query("access_key") key: String,
        @Query("symbols") symbols: String
    ): Observable<Model.Result>

    @GET("symbols")
    fun getSymbols(
        @Query("access_key") key: String
    ): Observable<Model2.Result>

    companion object {
        fun create(): Service {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(
                    RxJava2CallAdapterFactory.create()
                )
                .addConverterFactory(
                    GsonConverterFactory.create()
                )
                .baseUrl("http://data.fixer.io/api/")
                .build()

            return retrofit.create(Service::class.java)
        }
    }
}