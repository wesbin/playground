package com.holy.back.entity.musics.mapping

import java.math.BigDecimal

interface MusicsIdAndTitleOnly {

    val musicId: BigDecimal?
    val title: String?
}