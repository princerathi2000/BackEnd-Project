package com.simplilearn.hibernate.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.hibernate.client.Client;
import com.simplilearn.hibernate.dto.Customer;
import com.simplilearn.hibernate.util.SessionFactoryManagerImpl;

public class customerDaoImpl implements customerDao{
	private SessionFactory factory;
	
	public customerDaoImpl() {
		factory= new SessionFactoryManagerImpl().getSessionFactory();
	}
	
	@Override
	public Integer addCustomer(Customer customer) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Integer customerId=(Integer) session.save(customer);
		transaction.commit();
		session.close();
		return customerId;
	}

	@Override
	public void updateCustomer(int customerId, String address) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Customer customer=session.get(Customer.class,customerId);
		customer.setAddress("Mumbai");
		session.update(customer);
//		Client client=(Client)session.update(Customer.class,customerId);
//		session.update(address, transaction);
		System.out.println(customer);
		transaction.commit();
		session.close();		
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Customer customer=session.get(Customer.class,customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
	}

	@Override
	public Customer searchCustomer(int customerId) {

		
		return null;
	}

	@Override
	public Set<Customer> getAllCustomers() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		Customer customer=session.getClass();
		return null;
	}

}
