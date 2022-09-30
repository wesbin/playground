package com.holy.back.entity.author

import com.holy.back.entity.comics.ComicsData
import java.math.BigDecimal

data class AuthorData(
    var authorId: BigDecimal?,
    var name: String?,
    var works: List<ComicsData>,
)

//fun AuthorData.fromEntity(authorEntity: AuthorEntity): AuthorData {
//    return authorEntity.run {
//        AuthorData(
//            authorId,
//            name,
//        )
//    }
//}