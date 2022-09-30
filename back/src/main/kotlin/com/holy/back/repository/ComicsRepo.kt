package com.holy.back.repository

import com.holy.back.domain.comics.ComicsEntity
import com.holy.back.domain.comics.mapping.ComicsRecentView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal

@Repository
interface ComicsRepo: JpaRepository<ComicsEntity, BigDecimal> {

    fun findAllByRecentViewDateIsNotNullOrderByRecentViewDateDesc(): List<ComicsRecentView>
}