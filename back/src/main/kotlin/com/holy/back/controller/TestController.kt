package com.holy.back.controller

import com.holy.back.service.TestService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController(private val testService: TestService) {


}