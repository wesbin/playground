package com.holy.back.service

import com.holy.back.entity.comics.ComicsEntity
import com.holy.back.entity.comics.mapping.ComicsIdAndTitleOnly
import com.holy.back.entity.comics.mapping.ComicsRecentView
import com.holy.back.entity.episodes.ComicsEpisodesEntity
import com.holy.back.repository.ComicsEpisodesRepo
import com.holy.back.repository.ComicsRepo
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class ComicsService(
    private val comicsRepo: ComicsRepo,
    private val comicsEpisodesRepo: ComicsEpisodesRepo,
) {

    fun selectComics(): List<ComicsEntity> {
        return comicsRepo.findAll()
    }

    fun selectComicsById(id: BigDecimal): ComicsEntity? {
        return comicsRepo.findById(id).orElse(null)
    }

    fun selectRecentView(): List<ComicsRecentView> {
        return comicsRepo.findAllByRecentViewDateIsNotNullOrderByRecentViewDateDesc()
    }

    fun selectEpisodeById(id: BigDecimal): List<ComicsEpisodesEntity> {
        return comicsEpisodesRepo.findByComicId(id)
    }
}