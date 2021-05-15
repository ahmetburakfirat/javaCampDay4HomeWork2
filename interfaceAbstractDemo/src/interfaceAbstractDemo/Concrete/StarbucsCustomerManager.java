package interfaceAbstractDemo.Concrete;

import Adaptors.MernisServiceAdapter;
import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucsCustomerManager extends BaseCustomerManager {

	//CustomerCheckManager customerCheckManager; Hata alıyor
	MernisServiceAdapter check = new MernisServiceAdapter();
	
	@Override
	public void save(Customer customer) {
		
		
		if(check.CheckIfRealPerson(customer))
		{
			System.out.println("Saved to db " + customer.getFirstName());
		}else {
			System.out.println("Can not saved to db " + customer.getFirstName());
		}
	}

	

	
}
