package interfaceAbstractDemo;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucsCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucsCustomerManager();
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("AhmetBurak");
		customer.setLastName("Fırat");
		customer.setYearOfBirth(1998);
		customer.setNationalityId(24589);
		
		customerManager.save(customer);

	}

}
