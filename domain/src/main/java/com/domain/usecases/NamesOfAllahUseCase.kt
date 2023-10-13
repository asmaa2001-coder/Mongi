package com.domain.usecases

import com.domain.repository.NamesOfAllahRepo

class NamesOfAllahUseCase(private val repo:NamesOfAllahRepo) {
    fun getMeaning(name:String)= repo.getNameMeaning(name)
}