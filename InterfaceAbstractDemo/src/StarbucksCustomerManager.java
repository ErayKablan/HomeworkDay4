
public class StarbucksCustomerManager extends BaseCustomerManager{
CustomerCheckManager customerCheck = new CustomerCheckManager();
	
	@Override
	public void Save(Customer customer) {
		
		if(customerCheck.checkRealPerson(customer)) {
			System.out.println("Müþteri veritabanýna kaydedildi : " + customer.getFirstName());
		}
		else
		{
			System.out.println("Kiþi doðrulanamadý: " + customer.getFirstName());
		}

    }
}
