package com.holy.back.entity

import java.math.BigDecimal
import lombok.Getter
import lombok.Setter
import java.sql.Date
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "COMICS")
@Getter
@Setter
@SequenceGenerator(
    name = "COMICS_ID_GENERATOR",
    sequenceName = "SEQ_COMICS_NO",
    initialValue = 1, allocationSize = 1
)
open class ComicsEntity { 

    @Id
    @Column(name = "COMIC_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMICS_ID_GENERATOR")
    open var comicId: BigDecimal? = null

    @Column(name = "TITLE", nullable = false)
    open var title: String? = null

    @Column(name = "REVIEW", nullable = true)
    open var review: String? = null

    @Column(name = "RECENT_VIEW_EPISODE", nullable = true)
    open var recentViewEpisode: BigDecimal? = null

    @Column(name = "RECENT_VIEW_DATE", nullable = true)
    open var recentViewDate: LocalDate? = null
} 
