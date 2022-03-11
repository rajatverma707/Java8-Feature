package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.java8.model.Customer;
import com.java8.util.CustomerUtil;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		
		List<Customer> customers = CustomerUtil.getCustomers();
		
		System.out.println("-------Customers ---------");
//		Consumer<Customer> c = a ->
//		{
//			System.out.println(" Customer Name :"+a.getName().toUpperCase());
//		};
//		//c.accept(c);
//		
//		//customers.forEach(c);
//		customers.stream().forEach(c);
//		
		
		//alternate way of writing it
		customers.stream().forEach(a -> System.out.println("Customer Name : "+a.getName()));
		
		
		
		int arr[]= {1,3,2,5,6};
		
		for(int i= 0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
