package com.holy.back.domain.comics.mapping

import java.math.BigDecimal

interface ComicsIdAndTitleOnly {

    val comicId: BigDecimal?
    val title: String?
}