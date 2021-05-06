package inheritance;

public class Main {

	public static void main(String[] args) {
		
		   IndividualCustomer individualCustomer1 = new IndividualCustomer();
		   individualCustomer1.customerNumber = "1223454";
		
		
		    CorporateCustomer corporateCustomer1 = new CorporateCustomer();
			corporateCustomer1.customerNumber = "265552596";
			
			SendikaCustomer sendikaCustomer1 = new SendikaCustomer();
			sendikaCustomer1.customerNumber = "54852248";
			
			
			CustomerManager customerManager = new CustomerManager();
			
			Customer[] customers = {individualCustomer1,corporateCustomer1, sendikaCustomer1};
			
			customerManager.addMultiple(customers);
			
			
			/*
			 * customerManager.add(corporateCustomer1);
			 * customerManager.add(individualCustomer1);
			 * customerManager.add(sendikaCustomer1);
			 */
		

		}

	}