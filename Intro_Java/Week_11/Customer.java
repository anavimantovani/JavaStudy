//Author: Ana Victoria Gomes Mantovani
//Date: 11/04/2022
//Purpose: Store clients data

public class Customer extends Person
{
	//Initiate private fields for customer number and mailing list decision
	private int customerNumber;
	private boolean mailing;
	
	//Set customer number
	public void setCustomerNumber(int customerN)
	{ customerNumber = customerN; }
	
	//Set mailing list decision
	public void setMailing(boolean mail)
	{ mailing = mail; }
	
	//Get customer number
	public int getCustomerNumber()
	{ return customerNumber; }
	
	//Get mailing list decision
	public boolean getMailing()
	{ return mailing; }
	
	//Transform the boolean value into a string to display for the user
	public String getAnswer()
	{
		String answer;
		
		if(mailing)
		{
			answer = "Yes";
		}
		else
		{
			answer = "No";
		}
		
		return answer;
	}
	
	//Constructor that takes the customer number and mailing list decision
	public Customer(int customerN, boolean mail)
	{
		customerNumber = customerN;
		mailing = mail;
	}
	
	//No-arg constructor
	public Customer()
	{
		
	}
	
	//Transform object data into a string
	public String toString()
	{
		String str = "Number: " + customerNumber +
					 "\nMailing list: ";
		
		return str;
	}

}
