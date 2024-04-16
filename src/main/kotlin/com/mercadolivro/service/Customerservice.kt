package com.mercadolivro.service

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Service
class Customerservice (

    val customerRepository: CustomerRepository
) {
    val customers = mutableListOf<CustomerModel>()

    // retorna todos os elementos da lista
    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customerRepository.findByNameContaining(name)
        }
        return customerRepository.findAll().toList()
    }

    fun create(customer: CustomerModel) { // @RequestBody neste caso indica que os dados virão da classse PostCustomerRequest
        customerRepository.save(customer)
    }


    fun getCustomer(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow()
    }

    // Atualizar registros
    fun update(customer: CustomerModel) {
        if (!customerRepository.existsById(customer.id!!)) {
            throw Exception()
        }

        customerRepository.save(customer)
    }

    //Deletar Registros
    fun delete(id: Int) {
        if (!customerRepository.existsById(id)) {
            throw Exception()
        }

        customerRepository.deleteById(id)
    }
}

