package com.holy.back.controller

import com.holy.back.repository.ComicsRepo
import com.holy.back.service.ComicsService
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.extensions.spring.SpringExtension
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import org.springframework.boot.test.context.SpringBootTest

// https://techblog.woowahan.com/5825/

@SpringBootTest
class ComicsControllerTests (private val comicsRepo: ComicsRepo): DescribeSpec({

    val comicsRepoMockk = mockk<ComicsRepo>()
    val comicsService = ComicsService(comicsRepoMockk)

    describe("Kotest") {
        context("DescribeSpec Test") {
            it("selectComics has no data") {
                every { comicsRepoMockk.findAll() } returns emptyList()
                comicsService.selectComics().size shouldBe 0
            }
        }
    }

    describe("noMockk") {
        context("OneToMany Test") {
            it("Comics Join ComicsEpisodes") {
                comicsRepo.findAll().size shouldBeGreaterThan 0
            }
        }
    }

}) {
    override fun extensions() = listOf(SpringExtension)
}