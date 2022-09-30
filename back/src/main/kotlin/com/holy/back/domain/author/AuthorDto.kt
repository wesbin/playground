package com.holy.back.domain.author

import com.holy.back.domain.comics.ComicsDto
import java.math.BigDecimal

data class AuthorDto(
    var authorId: BigDecimal?,
    var name: String?,
    var works: List<ComicsDto>,
)

//fun AuthorData.fromEntity(authorEntity: AuthorEntity): AuthorData {
//    return authorEntity.run {
//        AuthorData(
//            authorId,
//            name,
//        )
//    }
//}