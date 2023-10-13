package com.domain.usecases

import com.domain.repository.AzkarRepository

class AzkarUseCases(private val repo:AzkarRepository) {
     fun viewZekrByType(type:String)=repo.getZekrByType(type)
     fun viewZekrBySearching(name:String)=repo.getZekrBySearch(name)
}