package com.example.retrofit_kotlin

data class Todo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)