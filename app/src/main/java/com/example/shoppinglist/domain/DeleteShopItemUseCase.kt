package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

class DeleteShopItemUseCase (private val shopItemRepository: ShopItemRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
    shopItemRepository.deleteShopItem(shopItem)
    }
}