package com.holy.back.entity

import java.math.BigDecimal
import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "MUSICS")
@Getter
@Setter
@SequenceGenerator(
    name = "MUSICS_ID_GENERATOR",
    sequenceName = "SEQ_MUSICS_NO",
    initialValue = 1, allocationSize = 1
)
open class MusicsEntity { 

    @Id
    @Column(name = "MUSIC_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MUSICS_ID_GENERATOR")
    open var musicId: BigDecimal? = null

    @Column(name = "TITLE", nullable = false)
    open var title: String? = null

    @Column(name = "LYRICS", nullable = true)
    open var lyrics: String? = null

} 