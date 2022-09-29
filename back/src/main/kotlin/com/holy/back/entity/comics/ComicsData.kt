package com.holy.back.entity.comics

import com.holy.back.entity.author.AuthorData
import java.math.BigDecimal
import java.time.LocalDate

data class ComicsData(
    var comicId: BigDecimal?,
    var title: String?,
    var review: String?,
    var recentViewEpisode: BigDecimal?,
    var recentViewDate: LocalDate?,
//    var authorId: BigDecimal?,
    var author: AuthorData?
)

fun ComicsData.fromEntity(comicsEntity: ComicsEntity): ComicsData {
    return comicsEntity.run {
        ComicsData(
            comicId,
            title,
            review,
            recentViewEpisode,
            recentViewDate,
        )
    }
}