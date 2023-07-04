package com.example.shoppinglist.domain.entities

data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enable: Boolean
)