package com.holy.back.repository

import com.holy.back.domain.episodes.entity.ComicsEpisodesEntity
import com.holy.back.domain.episodes.entity.ComicsEpisodesKey
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal

@Repository
interface ComicsEpisodesRepo: JpaRepository<ComicsEpisodesEntity, ComicsEpisodesKey> {

    fun findByComicId(id: BigDecimal): List<ComicsEpisodesEntity>
}