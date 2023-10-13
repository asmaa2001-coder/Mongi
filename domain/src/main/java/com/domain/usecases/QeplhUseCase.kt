package com.domain.usecases

import com.domain.repository.QuplhRepo

class QeplhUseCase (private val repo: QuplhRepo){
    suspend fun calculateTheQeplh(location:String) =repo.getQeplh(location)
}