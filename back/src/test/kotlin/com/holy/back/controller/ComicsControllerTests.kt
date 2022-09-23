package com.holy.back.controller

import com.holy.back.repository.ComicsRepo
import com.holy.back.service.ComicsService
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.extensions.spring.SpringExtension
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import org.springframework.boot.test.context.SpringBootTest

// https://techblog.woowahan.com/5825/

@SpringBootTest
class ComicsControllerTests (): DescribeSpec({

    val comicsRepo = mockk<ComicsRepo>()
    val comicsService = ComicsService(comicsRepo)

    describe("Kotest") {
        context("DescribeSpec Test") {
            it("selectComics has no data") {
                every { comicsRepo.findAll() } returns emptyList()
                comicsService.selectComics().size shouldBe 0
            }
        }
    }

}) {
    override fun extensions() = listOf(SpringExtension)
}