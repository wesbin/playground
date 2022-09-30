package com.holy.back.repository

import com.holy.back.domain.musics.MusicsEntity
import com.holy.back.domain.musics.mapping.MusicsIdAndTitleOnly
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal

@Repository
interface MusicsRepo: JpaRepository<MusicsEntity, BigDecimal> {

    fun findAllByRecentViewDateIsNotNullOrderByRecentViewDateDesc(): List<MusicsIdAndTitleOnly>
}