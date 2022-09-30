package com.holy.back.domain.musics

import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "MUSICS")
@SequenceGenerator(
    name = "MUSICS_ID_GENERATOR",
    sequenceName = "SEQ_MUSICS_NO",
    initialValue = 1, allocationSize = 1
)
class MusicsEntity (

    @Column(name = "TITLE", nullable = false)
    var title: String? = null,

    @Column(name = "LYRICS", nullable = true)
    var lyrics: String? = null,

    @Column(name = "RECENT_VIEW_DATE", nullable = true)
    var recentViewDate: LocalDate? = null,

) {

    @Id
    @Column(name = "MUSIC_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MUSICS_ID_GENERATOR")
    var musicId: BigDecimal? = null
}
