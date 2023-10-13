package com.domain.entities

data class Ayat(
    val id: Int,
    val content: String,
    val contentTashkil:String,
    val numberOfAyat: Int,
    val jazeNumber: Int,
    val nameOfSourah: String,
    val numberOfSourah :Int
)
