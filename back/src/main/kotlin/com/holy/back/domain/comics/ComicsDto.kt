package com.holy.back.domain.comics

import java.math.BigDecimal
import java.time.LocalDate

data class ComicsDto(
    var comicId: BigDecimal?,
    var title: String?,
    var review: String?,
    var recentViewEpisode: BigDecimal?,
    var recentViewDate: LocalDate?,
    var authorId: BigDecimal?,
//    var author: AuthorData?
) {

    fun toEntity(): ComicsEntity = ComicsEntity(title, review, recentViewEpisode, recentViewDate, authorId)

    companion object {
        fun fromEntity(entity: ComicsEntity): ComicsDto =
            entity.run {
                ComicsDto(comicId, title, review, recentViewEpisode, recentViewDate, authorId)
            }
    }
}
