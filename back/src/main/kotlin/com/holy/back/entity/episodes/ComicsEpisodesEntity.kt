package com.holy.back.entity.episodes

import com.holy.back.entity.comics.ComicsEntity
import java.math.BigDecimal
import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "COMICS_EPISODES")
@Getter
@Setter
@IdClass(ComicsEpisodesKey::class)
open class ComicsEpisodesEntity {

    @Id
    @Column(name = "COMIC_ID")
    open var comicId: BigDecimal? = null

    @Id
    @Column(name = "EPISODE")
    open var episode: BigDecimal? = null

    @Column(name = "CONTENT", nullable = true)
    open var content: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMIC_ID")
    open var comic: ComicsEntity? = null
} 
