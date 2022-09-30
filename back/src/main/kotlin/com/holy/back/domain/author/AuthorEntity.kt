package com.holy.back.domain.author

import com.holy.back.domain.comics.ComicsEntity
import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "AUTHOR")
class AuthorEntity (

    @Column(name = "NAME", nullable = false)
    var name: String? = null,

    @Id
    @Column(name = "AUTHOR_ID")
    var authorId: BigDecimal? = null,

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    val works: List<ComicsEntity> = arrayListOf()

)
