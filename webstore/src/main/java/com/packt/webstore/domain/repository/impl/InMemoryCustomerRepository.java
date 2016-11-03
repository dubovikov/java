package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
private List<Customer> listOfCustomer=new ArrayList<Customer>();

    public InMemoryCustomerRepository() {
        Customer first=new Customer("C1234","IVan","Ukraine","123");
        listOfCustomer.add(first);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return listOfCustomer;
    }
}
