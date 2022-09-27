package com.holy.back.service

import com.holy.back.entity.musics.MusicsEntity
import com.holy.back.entity.musics.mapping.MusicsIdAndTitleOnly
import com.holy.back.repository.MusicsRepo
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class MusicsService(private val musicsRepo: MusicsRepo) {

    fun selectMusics(): List<MusicsEntity> {
        return musicsRepo.findAll()
    }

    fun selectMusicsById(id: BigDecimal): MusicsEntity? {
        return musicsRepo.findById(id).orElse(null)
    }

    fun selectRecentView(): List<MusicsIdAndTitleOnly> {
        return musicsRepo.findAllByRecentViewDateIsNotNullOrderByRecentViewDateDesc()
    }
}