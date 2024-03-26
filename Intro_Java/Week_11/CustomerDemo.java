//Author: Ana Victoria Gomes Mantovani
//Date: 11/04/2022
//Purpose: Store clients data

public class CustomerDemo {

	public static void main(String[] args) 
	{
		
		//Create first customer object
		Person customer1 = new Person("Carl Jackson", "123 Wheaton", "555-123-4567");
		Customer customer1Data = new Customer (1234, true);
		
		//Create second customer object
		Person customer2 = new Person("Michelle Williams", "123 Glenn Ellyn", "555-456-7890");
		Customer customer2Data = new Customer (6789, false);
		
		//Display object informations to the user
		System.out.println("Customer information: ");
		System.out.println();
		
		//First customer information
		System.out.println("Customer #1: ");
		System.out.println(customer1.toString());
		System.out.println(customer1Data.toString() + customer1Data.getAnswer());
		System.out.println();
		
		//Second user information
		System.out.println("Customer #2: ");
		System.out.println(customer2.toString());
		System.out.println(customer2Data.toString() + customer2Data.getAnswer());
		System.out.println();
		
	}

}
