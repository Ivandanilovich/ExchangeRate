package com.example.exchangerate

object Model {
    data class Result(val rates: Rate, val date: String)
    data class Rate(
        val RUB: Double,
        val USD: Double
    )
}

object Model2 {
    data class Result(val symbols: String)
}

data class RateModel(
    var name: String,
    var fullName: String,
    var soldPrice: Double,
    var isUpSoldPrice: Boolean,
    var imageId: Int,
    var purchasePrice: Double,
    var isUpPurchasePrice: Boolean
) {

}