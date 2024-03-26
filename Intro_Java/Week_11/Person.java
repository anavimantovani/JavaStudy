//Author: Ana Victoria Gomes Mantovani
//Date: 11/04/2022
//Purpose: Store clients data

public class Person
{
	//Initiate private fields for customer's name, address and phone number
	private String name;
	private String address;
	private String phoneNumber;
	
	//Set customer name
	public void setName(String n)
	{ name = n; }
	
	//Set customer address
	public void setAddress(String a)
	{ address = a; }
	
	//Set customer phone number
	public void setPhoneNumber(String phoneN)
	{ phoneNumber = phoneN; }
	
	//Get customer name
	public String getName()
	{ return name; }
	
	//Get customer address
	public String getAddress()
	{ return address; }
	
	//Get customer phone number
	public String getPhoneNumber()
	{ return phoneNumber; }
	
	//Constructor that takes the name, address and phone number as parameters
	public Person (String n, String a, String phoneN)
	{
		name = n;
		address = a;
		phoneNumber = phoneN;
	}
	
	//No-arg constructor
	public Person()
	{
		
	}

	//Transform object data into a string
	public String toString()
	{
		String str = "Name: " + name +
					 "\nAddress: " + address +
					 "\nPhone Number: " + phoneNumber;
		
		return str;
	}
}
