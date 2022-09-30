package com.holy.back.domain.episodes.entity

import java.io.Serializable
import java.math.BigDecimal

class ComicsEpisodesKey: Serializable {

    open var comicId: BigDecimal? = null

    open var episode: BigDecimal? = null
}