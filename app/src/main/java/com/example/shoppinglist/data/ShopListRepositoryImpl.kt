package com.example.shoppinglist.data


import com.example.shoppinglist.domain.ShopListRepository
import com.example.shoppinglist.domain.entities.ShopItem

object ShopListRepositoryImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementId = 0

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getShopListItem(shopItem.id)
        deleteShopItem(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopListItem(id: Int): ShopItem {
        return shopList.find { it.id == id } ?: throw Exception("This element $id not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }
}