package com.holy.back.domain.comics

import com.holy.back.domain.author.AuthorEntity
import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "COMICS")
@SequenceGenerator(
    name = "COMICS_ID_GENERATOR",
    sequenceName = "SEQ_COMICS_NO",
    initialValue = 1, allocationSize = 1
)
class ComicsEntity(

    @Column(name = "TITLE", nullable = false)
    var title: String?,

    @Column(name = "REVIEW", nullable = true)
    var review: String?,

    @Column(name = "RECENT_VIEW_EPISODE", nullable = true)
    var recentViewEpisode: BigDecimal?,

    @Column(name = "RECENT_VIEW_DATE", nullable = true)
    var recentViewDate: LocalDate?,

    @Column(name = "AUTHOR_ID", nullable = true)
    var authorId: BigDecimal?,

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "comic")
//    val comicsEpisodes: List<ComicsEpisodesEntity> = arrayListOf()

    @ManyToOne(fetch = FetchType.LAZY)
    // todo insertable = false, updatable = false 가 정확히 어떤 역할을? 다른 방법으로는?
    @JoinColumn(name = "AUTHOR_ID", referencedColumnName = "AUTHOR_ID", insertable = false, updatable = false)
    val author: AuthorEntity? = null,
) {

    @Id
    @Column(name = "COMIC_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMICS_ID_GENERATOR")
    val comicId: BigDecimal? = null
}
