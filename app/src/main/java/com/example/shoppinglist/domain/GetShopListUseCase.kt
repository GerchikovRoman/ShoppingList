package com.example.shoppinglist.domain

import com.example.shoppinglist.domain.entities.ShopItem

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> = shopListRepository.getShopList()

}