package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
		
	}
	//bulk insert : Bireysel, sendika,corporate bilgilerini ayný anda göndermek istenildiðinde kullanýlýr. 
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
			
		}
		
	}
	

}
//SOLID - Open Closed Principle