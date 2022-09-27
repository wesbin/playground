package com.holy.back.service

import com.holy.back.entity.ComicsEntity
import com.holy.back.repository.ComicsRepo
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class ComicsService(private val comicsRepo: ComicsRepo) {

    fun selectComics(): List<ComicsEntity> {
        return comicsRepo.findAll()
    }

    fun selectComicsById(id: BigDecimal): ComicsEntity? {
        return comicsRepo.findById(id).orElse(null)
    }

    fun selectRecentView(): List<ComicsEntity> {
        return comicsRepo.findAllByRecentViewDateIsNotNullOrderByRecentViewDateDesc()
    }
}