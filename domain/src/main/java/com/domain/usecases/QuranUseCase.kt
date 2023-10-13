package com.domain.usecases

import com.domain.repository.QuranRepository

class QuranUseCase(private val repo: QuranRepository) {
    operator fun invoke(pageNumber: Int) = repo.getQuranPage(pageNumber)
    operator fun invoke(ayaContent: String) = repo.getAyat(ayaContent)
    suspend fun viewTafsir(ayah: String) = repo.getTafsir(ayah)
    fun viewWordMeaning(word:String) =repo.getMeaning(word)


}