package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

class GetShopListUseCase(private val shopItemRepository: ShopItemRepository) {

    fun getShopList(): List<ShopItem> = shopItemRepository.getShopList()

}