package com.holy.back.domain.episodes.entity

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "COMICS_EPISODES")
@IdClass(ComicsEpisodesKey::class)
open class ComicsEpisodesEntity (

    @Id
    @Column(name = "EPISODE")
    open var episode: BigDecimal? = null,

    @Column(name = "CONTENT", nullable = true)
    open var content: String? = null,

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "COMIC_ID")
//    open var comic: ComicsEntity? = null,

) {

    @Id
    @Column(name = "COMIC_ID")
    open var comicId: BigDecimal? = null
}
