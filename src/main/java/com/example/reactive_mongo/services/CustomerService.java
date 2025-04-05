package com.example.reactive_mongo.services;

import com.example.reactive_mongo.model.CustomerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
    Mono<CustomerDTO> saveCustomer(CustomerDTO customerDTO);

    Mono<CustomerDTO> saveCustomer(Mono<CustomerDTO> customerDTO);

    Mono<CustomerDTO> getCustomerById(String customerId);

    Flux<CustomerDTO> listCustomers();

    Mono<Void> deleteCustomerById(String customerId);

    Mono<CustomerDTO> updateCustomerById(String customerId, CustomerDTO customerDTO);

    Mono<CustomerDTO> patchCustomerById(String customerId, CustomerDTO customerDTO);
}
