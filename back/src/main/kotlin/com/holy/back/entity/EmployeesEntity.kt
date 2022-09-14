package com.holy.back.entity

import java.math.BigDecimal
import java.time.LocalDate
import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Entity
@Table(name = "EMPLOYEES")
@Getter
@Setter
open class EmployeesEntity { 

    @Id
    @Column(name = "EMPLOYEE_ID")
    open var employeeId: BigDecimal? = null

    @Column(name = "FIRST_NAME", nullable = false)
    open var firstName: String? = null

    @Column(name = "LAST_NAME", nullable = false)
    open var lastName: String? = null

    @Column(name = "EMAIL", nullable = false)
    open var email: String? = null

    @Column(name = "PHONE", nullable = false)
    open var phone: String? = null

    @Column(name = "HIRE_DATE", nullable = false)
    open var hireDate: LocalDate? = null

    @Column(name = "MANAGER_ID", precision = 12)
    open var managerId: BigDecimal? = null

    @Column(name = "JOB_TITLE", nullable = false)
    open var jobTitle: String? = null

} 
