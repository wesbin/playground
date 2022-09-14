package com.holy.back.repository

import com.holy.back.entity.EmployeesEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal

@Repository
interface EmployeeRepo: JpaRepository<EmployeesEntity, BigDecimal> {

    fun findAllBy(): List<EmployeesEntity>
    fun findByEmployeeId(employeeId: BigDecimal): EmployeesEntity
}