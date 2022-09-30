package com.holy.back.domain.episodes

import java.io.Serializable
import java.math.BigDecimal

class ComicsEpisodesKey: Serializable {

    var comicId: BigDecimal? = null

    var episode: BigDecimal? = null
}