package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

class EditShopItemUseCase (private val shopListRepository: ShopListRepository){

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}