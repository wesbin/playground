package com.holy.back.domain.author

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "AUTHOR")
open class AuthorEntity (

    @Column(name = "NAME", nullable = false)
    var name: String? = null,

    @Id
    @Column(name = "AUTHOR_ID")
    var authorId: BigDecimal? = null,

//    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
//    val works: List<ComicsEntity> = arrayListOf()

)
