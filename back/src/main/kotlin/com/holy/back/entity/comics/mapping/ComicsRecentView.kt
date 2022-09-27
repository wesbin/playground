package com.holy.back.entity.comics.mapping

import java.math.BigDecimal

interface ComicsRecentView: ComicsIdAndTitleOnly {

    val recentViewEpisode: BigDecimal?
}