package com.holy.back.domain.musics.mapping

import java.math.BigDecimal

interface MusicsIdAndTitleOnly {

    val musicId: BigDecimal?
    val title: String?
}