
public abstract class BaseCustomerManager implements ICustomerService{
	@Override
	public void Save(Customer customer) {
		System.out.println("M��teri veritaban�na kaydedildi: " + customer.firstName);
	}

}
