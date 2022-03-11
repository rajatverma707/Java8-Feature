package com.java8.util;

import com.java8.model.Customer;

import java.util.*;

public class CustomerUtil {

 
 public static List<Customer> getCustomers() {
	 Customer customer = null;
	 List<Customer> customers = new ArrayList<Customer>();

	 customer = new Customer();
	 customer.setId(1);
	 customer.setName("Rajat");
	 customer.setEmail("rajatverma707@gmail.com");
	 customer.setAddress("UK");
	 customers.add(customer);

	 customer = new Customer();
	 customer.setId(1);
	 customer.setName("Ajay");
	 customer.setEmail("ajay@gmail.com");
	 customer.setAddress("Delhi");
	 customers.add(customer);

	 customer = new Customer();
	 customer.setId(1);
	 customer.setName("Bishoy");
	 customer.setEmail("bishoy@gmail.com");
	 customer.setAddress("Hyd");
	 customers.add(customer);

	 customer = new Customer();
	 customer.setId(1);
	 customer.setName("Charan");
	 customer.setEmail("charan@gmail.com");
	 customer.setAddress("Banglore");
	 customers.add(customer);

	 customer = new Customer();
	 customer.setId(1);
	 customer.setName("Shah");
	 customer.setEmail("shah@gmail.com");
	 customer.setAddress("Pune");
	 customers.add(customer);
	 
	 return customers;
 }
  
}
