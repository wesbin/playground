package com.holy.back.domain.author

import com.holy.back.domain.comics.ComicsDto
import java.math.BigDecimal

data class AuthorDto(
    var authorId: BigDecimal?,
    var name: String?,
    var works: List<ComicsDto> = arrayListOf(),
) {

    companion object {
        fun fromEntity(entity: AuthorEntity): AuthorDto =
            entity.run {
                AuthorDto(authorId, name)
            }
    }
}