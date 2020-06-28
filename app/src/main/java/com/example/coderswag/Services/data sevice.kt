package com.example.coderswag.Services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object `DataService` {

    val catagories = listOf(
        Category("Shirts","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","18","hat01"),
        Product("Deveslopes Hat Black","20","hat02"),
        Product("Deveslopes Hat White","16","hat03"),
        Product("Deveslopes Hat Snap Back","10","hat04")

    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Grey","23","hoodie01"),
        Product("Deveslopes Hoodie Black","20","hoodie02"),
        Product("Deveslopes Hoodie White","16","hoodie03"),
        Product("Deveslopes Hoodie blue","10","hoodie04")

    )
    val shirts = listOf(
        Product("Devslopes Grey shirt","18","shirt01"),
        Product("Deveslopes Black shirt","20","shirt02"),
        Product("Deveslopes White shirt","16","shirt03"),
        Product("Deveslopes Blue shirt","10","shirt04")

    )
}