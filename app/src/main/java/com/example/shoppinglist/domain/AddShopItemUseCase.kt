package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

class AddShopItemUseCase(private val shopItemRepository: ShopItemRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopItemRepository.addShopItem(shopItem)
    }
}