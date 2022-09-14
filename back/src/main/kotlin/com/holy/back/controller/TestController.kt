package com.holy.back.controller

import com.holy.back.entity.EmployeesEntity
import com.holy.back.service.TestService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("/test")
class TestController(private val testService: TestService) {

    @GetMapping("/employee")
    fun selectTest(): ResponseEntity<List<EmployeesEntity>> {
        return ResponseEntity(testService.selectTest(), HttpStatus.OK)
    }

    @GetMapping("/employee/{employeeId}")
    fun selectTest(@PathVariable employeeId: BigDecimal): ResponseEntity<EmployeesEntity> {
        return ResponseEntity(testService.selectTestByEmployeeId(employeeId), HttpStatus.OK)
    }
}