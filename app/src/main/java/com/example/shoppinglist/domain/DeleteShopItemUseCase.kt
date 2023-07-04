package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

class DeleteShopItemUseCase (private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
    shopListRepository.deleteShopItem(shopItem)
    }
}