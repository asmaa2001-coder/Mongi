package com.domain.repository

import com.domain.entities.Ayat

interface NamesOfAllahRepo {
    fun getNameMeaning(name:String):String
    fun getNamePositionsInQuran(name:String):Ayat
}