package com.holy.back.domain.comics.mapping

import java.math.BigDecimal

interface ComicsRecentView: ComicsIdAndTitleOnly {

    val recentViewEpisode: BigDecimal?
}