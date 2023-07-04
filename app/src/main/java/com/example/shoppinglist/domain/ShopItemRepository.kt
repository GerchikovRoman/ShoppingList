package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

interface ShopItemRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopList(): List<ShopItem>

    fun updateShopListItem(shopListItem: List<ShopItem>)
}