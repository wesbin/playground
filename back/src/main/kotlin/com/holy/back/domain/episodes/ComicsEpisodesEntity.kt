package com.holy.back.domain.episodes

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "COMICS_EPISODES")
@IdClass(ComicsEpisodesKey::class)
open class ComicsEpisodesEntity (

    @Id
    @Column(name = "EPISODE")
    var episode: BigDecimal? = null,

    @Column(name = "CONTENT", nullable = true)
    var content: String? = null,

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "COMIC_ID")
//    var comic: ComicsEntity? = null,

) {

    @Id
    @Column(name = "COMIC_ID")
    var comicId: BigDecimal? = null
}
