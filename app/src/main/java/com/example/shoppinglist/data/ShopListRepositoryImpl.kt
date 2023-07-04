package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopListRepository
import com.example.shoppinglist.domain.entities.ShopItem

object ShopListRepositoryImpl : ShopListRepository {
    override fun addShopItem(shopItem: ShopItem) {

    }

    override fun deleteShopItem(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun editShopItem(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun getShopList(): List<ShopItem> {
        TODO("Not yet implemented")
    }

    override fun updateShopListItem(shopListItem: List<ShopItem>) {
        TODO("Not yet implemented")
    }
}