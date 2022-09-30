package com.holy.back.entity.musics

import java.math.BigDecimal
import lombok.Getter
import lombok.Setter
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "MUSICS")
@SequenceGenerator(
    name = "MUSICS_ID_GENERATOR",
    sequenceName = "SEQ_MUSICS_NO",
    initialValue = 1, allocationSize = 1
)
open class MusicsEntity (

    @Column(name = "TITLE", nullable = false)
    open var title: String? = null,

    @Column(name = "LYRICS", nullable = true)
    open var lyrics: String? = null,

    @Column(name = "RECENT_VIEW_DATE", nullable = true)
    open var recentViewDate: LocalDate? = null,

) {

    @Id
    @Column(name = "MUSIC_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MUSICS_ID_GENERATOR")
    open var musicId: BigDecimal? = null
}
