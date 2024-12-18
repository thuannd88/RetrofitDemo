package com.example.retrofitdemo

import com.squareup.moshi.Json
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SimpleService {
    @GET("objects")
    suspend fun listAll(): List<PhoneInfor>
}
data class PhoneInfor (
    @Json(name = "id")val id: String?=null,
    @Json(name = "name")val name: String?=null,
    @Json(name = "data")val data: Data?=null)
data class Data (
    @Json(name="color") var color    : String? = null,
    @Json(name="capacity") var capacity : String? = null
)