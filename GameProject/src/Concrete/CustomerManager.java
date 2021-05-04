package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("Customer is added.");
		MultiplyLogger.MultiplyLog(customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer is deleted.");
		MultiplyLogger.MultiplyLog(customer.getFirstName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Customer is updated.");
		MultiplyLogger.MultiplyLog(customer.getFirstName());
	}

}
