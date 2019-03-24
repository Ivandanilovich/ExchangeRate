package com.example.exchangerate

object Model {
    data class Result(val rates: Rate)
    data class Rate(
        val RUB: Double,
        val USD: Double
    )
}

object Model2 {
    data class Result(val symbols: String)

}