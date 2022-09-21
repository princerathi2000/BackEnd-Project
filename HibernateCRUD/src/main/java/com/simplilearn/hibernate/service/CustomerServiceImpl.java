package com.simplilearn.hibernate.service;

import java.util.Set;

import com.simplilearn.hibernate.dao.customerDao;
import com.simplilearn.hibernate.dao.customerDaoImpl;
import com.simplilearn.hibernate.dto.Customer;

public class CustomerServiceImpl implements CustomerService{

	private customerDao dao=null;
	
	public CustomerServiceImpl() {
		dao=new customerDaoImpl();
	}
	
	@Override
	public Integer addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}

	@Override
	public void updateCustomer(int customerId, String address) {
		dao.updateCustomer(customerId, address);
		
	}

	@Override
	public void deleteCustomer(int customerId) {
		dao.deleteCustomer(customerId);
	}

	@Override
	public Customer searchCustomer(int customerId) {
		return dao.searchCustomer(customerId);
	}

	@Override
	public Set<Customer> getAllCustomers() {
		return dao.getAllCustomers();
	}

}
