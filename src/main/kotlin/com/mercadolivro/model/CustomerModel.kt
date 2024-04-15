package com.mercadolivro.model

import jakarta.persistence.*

@Entity(name = "customer")
data class CustomerModel (

    @Id  // Primary key
    //GenerateValue, gerar o id automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var name: String,

    @Column
    var email: String

)


