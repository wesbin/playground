package com.emptycastle.back.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
open class Test {

    @Id
    @GeneratedValue
    var id: Long? = null
}