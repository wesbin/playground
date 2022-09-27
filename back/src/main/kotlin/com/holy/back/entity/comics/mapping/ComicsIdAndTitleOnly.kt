package com.holy.back.entity.comics.mapping

import java.math.BigDecimal

interface ComicsIdAndTitleOnly {

    val comicId: BigDecimal?
    val title: String?
}