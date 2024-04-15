package com.mercadolivro.service

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Service
class Customerservice {
    val customers = mutableListOf<CustomerModel>()

    // retorna todos os elementos da lista
    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customers.filter {it.name.contains(name, true)}
        }
        return customers
    }


    fun create(customer: CustomerModel) { // @RequestBody neste caso indica que os dados virão da classse PostCustomerRequest
        customerRepository.save(customer)
    }


    fun getCustomer(id: Int): CustomerModel {
        return customers.filter { it -> it.id == id }.first()
    }

      // Atualizar registros
    fun update(customer: CustomerModel) {
        customers.filter { it -> it.id == customer.id }.first().let {
            it.name = customer.name
            it.email = customer.email
        }
    }

        //Deletar Registros
        fun delete(id: Int) {
            customers.removeIf { it.id == id }
    }
}