package com.holy.back.entity.comics

import com.holy.back.entity.author.AuthorEntity
import lombok.AllArgsConstructor
import java.math.BigDecimal
import lombok.Getter
import lombok.Setter
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "COMICS")
@SequenceGenerator(
    name = "COMICS_ID_GENERATOR",
    sequenceName = "SEQ_COMICS_NO",
    initialValue = 1, allocationSize = 1
)
open class ComicsEntity (

    @Column(name = "TITLE", nullable = false)
    open var title: String? = null,

    @Column(name = "REVIEW", nullable = true)
    open var review: String? = null,

    @Column(name = "RECENT_VIEW_EPISODE", nullable = true)
    open var recentViewEpisode: BigDecimal? = null,

    @Column(name = "RECENT_VIEW_DATE", nullable = true)
    open var recentViewDate: LocalDate? = null,

    @Id
    @Column(name = "COMIC_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMICS_ID_GENERATOR")
    open var comicId: BigDecimal?

//    @Column(name = "AUTHOR_ID", nullable = true)
//    open var authorId: BigDecimal? = null

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "comic")
//    open val comicsEpisodes: List<ComicsEpisodesEntity> = arrayListOf()

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "AUTHOR_ID", referencedColumnName = "AUTHOR_ID")
//    open val author: AuthorEntity? = null,
)
