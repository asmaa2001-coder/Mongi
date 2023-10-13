package com.domain.entities

import java.net.URL

/*
1- prefer to mahe the times of prayer is INT to make it certain
 */

data class PrayerTimes(val prayerType:Int,  val locationOfNearMasjid:URL)
