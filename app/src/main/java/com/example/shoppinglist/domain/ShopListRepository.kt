package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopListItem(id: Int): ShopItem

    fun getShopList(): List<ShopItem>
}