package com.domain.repository

interface AzkarRepository {
    fun getZekrByType (zekrType:String)
    fun getZekrBySearch (zekrName:String)

}