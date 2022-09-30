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
//    fun toEntity(): ComicsEntity = ComicsEntity(
//        comicId,
//        title,
//        review,
//        recentViewEpisode,
//        recentViewDate,
//        null
//    )
}

//fun ComicsData.fromEntity(comicsEntity: ComicsEntity): ComicsData {
//    return comicsEntity.run {
//        ComicsData(
//            comicId,
//            title,
//            review,
//            recentViewEpisode,
//            recentViewDate,
//            AuthorData(
//                this.author?.authorId,
//                this.author?.name,
//                arrayListOf()
//            )
//        )
//    }
//}