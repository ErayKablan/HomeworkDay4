
public class StarbucksCustomerManager extends BaseCustomerManager{
CustomerCheckManager customerCheck = new CustomerCheckManager();
	
	@Override
	public void Save(Customer customer) {
		
		if(customerCheck.checkRealPerson(customer)) {
			System.out.println("M��teri veritaban�na kaydedildi : " + customer.getFirstName());
		}
		else
		{
			System.out.println("Ki�i do�rulanamad�: " + customer.getFirstName());
		}

    }
}
