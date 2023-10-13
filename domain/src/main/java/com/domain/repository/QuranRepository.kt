package com.domain.repository

interface QuranRepository {
    fun getQuranPage(page: Int)
    fun getAyat(ayatNumber: Int)
    fun getAyat(ayatContent: String)
    fun getTafsir(ayatContent: String)
    fun getMeaning(word: String)

}