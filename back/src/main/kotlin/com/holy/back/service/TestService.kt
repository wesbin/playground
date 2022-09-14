package com.holy.back.service

import com.holy.back.entity.EmployeesEntity
import com.holy.back.repository.EmployeeRepo
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class TestService(private val employeeRepo: EmployeeRepo) {

    fun selectTest(): List<EmployeesEntity> {
        return employeeRepo.findAllBy()
    }

    fun selectTestByEmployeeId(employeeId: BigDecimal): EmployeesEntity {
        return employeeRepo.findByEmployeeId(employeeId)
    }
}