package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

class UpdateShopListItemUseCase(private val shopItemRepository: ShopItemRepository) {

    fun updateShopListItem(shopListItem: List<ShopItem>) {
        shopItemRepository.updateShopListItem(shopListItem)
    }
}