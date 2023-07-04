package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

class UpdateShopListItemUseCase(private val shopListRepository: ShopListRepository) {

    fun updateShopListItem(shopListItem: List<ShopItem>) {
        shopListRepository.updateShopListItem(shopListItem)
    }
}