package com.demos.services;

import com.demos.dao.CustomerDao;
import com.demos.pojos.Customer;

public class CustomerService {
	public static void main(String[] args)
	{
		CustomerDao cd=new CustomerDao();
		Customer customer=new Customer();
		customer.setCustName("aditya");
		customer.setCustLastName("ajshra");
		customer.setAddress("bangalore");
		
		cd.inputCus(customer);
	}
}
