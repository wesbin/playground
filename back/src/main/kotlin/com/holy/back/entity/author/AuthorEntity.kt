package com.holy.back.entity.author

import com.fasterxml.jackson.annotation.JsonManagedReference
import com.holy.back.entity.comics.ComicsEntity
import java.math.BigDecimal
import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "AUTHOR")
open class AuthorEntity (

    @Column(name = "NAME", nullable = false)
    open var name: String? = null,

    @Id
    @Column(name = "AUTHOR_ID")
    open var authorId: BigDecimal? = null,

//    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
//    open val works: List<ComicsEntity> = arrayListOf()

)
