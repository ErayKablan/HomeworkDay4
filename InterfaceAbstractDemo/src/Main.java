
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager;
		
		baseCustomerManager = new StarbucksCustomerManager();
		baseCustomerManager.Save(new Customer(1, "Eray", "Kablan", "2005", "123123123"));
		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();
		baseCustomerManager2.Save(new Customer(2, "Enes", "Arslan", "2005", "321321321"));

	}

}
