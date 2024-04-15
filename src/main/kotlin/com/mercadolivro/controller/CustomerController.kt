package com.mercadolivro.controller

import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.controller.request.PutCustomerRequest
import com.mercadolivro.extension.toCustomerModel
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.service.Customerservice
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customer")
class CustomerController(
    val customerService: Customerservice
) {

    //verifica nome
    @GetMapping // retorna todos os elementos da lista
    fun getAll(@RequestParam name: String?): List<CustomerModel> {
        return customerService.getAll(name).toList()
    }

//    @PostMapping
//    fun create(@RequestBody customer: CustomerModel) {
//        println(customer)
//    }


    // printar ID diferente
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)// Quando este metodo for chamado sera retornado o ResponseStatus
    fun create(@RequestBody customer: PostCustomerRequest) { // @RequestBody neste caso indica que os dados virão da classse PostCustomerRequest
        customerService.create(customer.toCustomerModel())
    }

    // Procura pela verificacao do id
    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Int): CustomerModel {
        return customerService.getCustomer(id)
    }


    //Atualizar Registros
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest) {
        customerService.update(customer.toCustomerModel(id))
    }

    //Deletar Registros
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) {
        customerService.delete(id)
    }
}



