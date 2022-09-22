package com.holy.back.controller

import com.holy.back.entity.ComicsEntity
import com.holy.back.repository.ComicsRepo
import com.holy.back.service.ComicsService
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.spring.SpringExtension
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import org.springframework.test.context.ContextConfiguration

// https://techblog.woowahan.com/5825/

@SpringBootTest
@ContextConfiguration(classes = [ComicsService::class])
class ComicsControllerTests (comicsService: ComicsService): FunSpec() {

    override fun extensions() = listOf(SpringExtension)

    init {
        test("TEST") {
            comicsService.selectComics().size shouldBe 0
        }
    }
}