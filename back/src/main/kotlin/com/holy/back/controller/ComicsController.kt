package com.holy.back.controller

import com.holy.back.domain.comics.ComicsDto
import com.holy.back.domain.comics.ComicsEntity
import com.holy.back.domain.comics.mapping.ComicsRecentView
import com.holy.back.domain.episodes.entity.ComicsEpisodesEntity
import com.holy.back.service.ComicsService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("/comics")
class ComicsController(private val comicsService: ComicsService) {

    @GetMapping("")
    fun selectComics(): ResponseEntity<List<ComicsDto>> {
        return ResponseEntity(comicsService.selectComics(), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun selectComicsById(@PathVariable id: BigDecimal): ResponseEntity<ComicsEntity?> {
        return ResponseEntity(comicsService.selectComicsById(id), HttpStatus.OK)
    }

    @GetMapping("/recent/view")
    fun selectRecentView(): ResponseEntity<List<ComicsRecentView>> {
        return ResponseEntity(comicsService.selectRecentView(), HttpStatus.OK)
    }

    @GetMapping("/comics/{id}")
    fun selectEpisodeById(@PathVariable id: BigDecimal): ResponseEntity<List<ComicsEpisodesEntity>> {
        return ResponseEntity(comicsService.selectEpisodeById(id), HttpStatus.OK)
    }
}