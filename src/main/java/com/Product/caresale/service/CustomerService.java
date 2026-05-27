package com.Product.caresale.service;

import com.Product.caresale.model.Customer;
import com.Product.caresale.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {

        @Autowired
        CustomerRepository customerRepository;

        public List<Customer> getAllCustomers() {
            return customerRepository.findAll();
        }
        public Customer saveCustomer (Customer customer) {
            return customerRepository.save(customer);
        }
}
