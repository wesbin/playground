package com.holy.back.service

import com.holy.back.domain.comics.ComicsDto
import com.holy.back.domain.comics.ComicsEntity
import com.holy.back.domain.comics.mapping.ComicsRecentView
import com.holy.back.domain.episodes.entity.ComicsEpisodesEntity
import com.holy.back.repository.ComicsEpisodesRepo
import com.holy.back.repository.ComicsRepo
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.util.stream.Collectors

@Service
class ComicsService(
    private val comicsRepo: ComicsRepo,
    private val comicsEpisodesRepo: ComicsEpisodesRepo,
) {

    fun selectComics(): List<ComicsDto> {
        val comicsEntities = comicsRepo.findAll()
        return comicsEntities.stream()
            .map { ComicsDto(
                it.comicId,
                it.title,
                it.review,
                it.recentViewEpisode,
                it.recentViewDate,
                it.authorId,
            ) }
            .collect(Collectors.toList())
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