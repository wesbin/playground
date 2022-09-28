package com.holy.back.entity

import com.holy.back.entity.comics.ComicsEntity
import java.math.BigDecimal
import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "COMICS_EPISODES")
@Getter
@Setter
open class ComicsEpisodesEntity {

    @Id
    @Column(name = "COMIC_ID")
    open var comicId: BigDecimal? = null

    @Column(name = "EPISODE")
    open var episode: BigDecimal? = null

    @Column(name = "CONTENT", nullable = true)
    open var content: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    open var comic: ComicsEntity? = null
} 
