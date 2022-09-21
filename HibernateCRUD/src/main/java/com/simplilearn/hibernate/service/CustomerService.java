package com.simplilearn.hibernate.service;

import java.util.Set;

import com.simplilearn.hibernate.dto.Customer;

public interface CustomerService {
	public Integer addCustomer(Customer customer);
    public void updateCustomer(int customerId,String address);
    public void deleteCustomer(int customerId);
    public Customer searchCustomer(int customerId);
    public Set<Customer> getAllCustomers();

}
