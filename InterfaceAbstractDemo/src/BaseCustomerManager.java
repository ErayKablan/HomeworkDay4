
public abstract class BaseCustomerManager implements ICustomerService{
	@Override
	public void Save(Customer customer) {
		System.out.println("Müşteri veritabanına kaydedildi: " + customer.firstName);
	}

}
