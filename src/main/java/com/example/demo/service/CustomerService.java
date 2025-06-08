package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final List<Customer> customers = new ArrayList<>();
    private long currentId = 1; 

    public Customer createCustomer(Customer customer) {
        customer.setId(currentId++); 
        customers.add(customer);
        return customer;
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Optional<Customer> getCustomerById(long id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst();
    }

    public Customer updateCustomer(long id, Customer updatedCustomer) {
        Customer customer = getCustomerById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setNome(updatedCustomer.getNome());
        customer.setNumero(updatedCustomer.getNumero());  // Troquei aqui
        return customer;
    }

    public void deleteCustomer(long id) {
        Customer customer = getCustomerById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        customers.remove(customer);
    }
}
