package com.example.reactive_mongo.mappers;

import com.example.reactive_mongo.domain.Customer;
import com.example.reactive_mongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
