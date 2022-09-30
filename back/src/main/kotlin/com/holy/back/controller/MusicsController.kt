package com.holy.back.controller

import com.holy.back.domain.musics.MusicsEntity
import com.holy.back.domain.musics.mapping.MusicsIdAndTitleOnly
import com.holy.back.service.MusicsService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("/musics")
class MusicsController(private val musicsService: MusicsService) {

    @GetMapping("")
    fun selectMusics(): ResponseEntity<List<MusicsEntity>> {
        return ResponseEntity(musicsService.selectMusics(), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun selectMusicsById(@PathVariable id: BigDecimal): ResponseEntity<MusicsEntity?> {
        return ResponseEntity(musicsService.selectMusicsById(id), HttpStatus.OK)
    }

    @GetMapping("/recent/view")
    fun selectRecentView(): ResponseEntity<List<MusicsIdAndTitleOnly>> {
        return ResponseEntity(musicsService.selectRecentView(), HttpStatus.OK)
    }
}