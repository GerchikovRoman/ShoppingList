package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

class EditShopItemUseCase (private val shopItemRepository: ShopItemRepository){

    fun editShopItem(shopItem: ShopItem) {
        shopItemRepository.editShopItem(shopItem)
    }
}