package com.example.retrofit_kotlin

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface TodoApi {
    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>

//    @POST("/createTodo")
//    suspend fun postTodo(@Body todo: Todo): Response<ResposeModel>
}