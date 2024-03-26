//Author: Ana Victoria Gomes Mantovani
//Date: 10/28/2022
//Purpose: Calculate the payroll

public class Payroll {

	//Private data members
	private String fullName; // Employee's full name
	private double hourlyRate; // Employee's hourly rate
	private int hoursWorked; // Employee's hours worked
	private double totalPay; // Employee's total pay
	
	//Set employee's name
	public void setName (String name)
	{ fullName = name; }
	
	//Set employee's hourly rate
	public void setRate(double rate)
	{ hourlyRate = rate; }
	
	//Set employee's hours worked
	public void setHoursWorked(int worked)
	{ hoursWorked = worked; }
	
	//Get employee's name
	public String getName()
	{ return fullName;}
	
	//Get employee's hourly rate
	public double getRate()
	{ return hourlyRate;}
	
	//Get employee's hours worked
	public int getHourWorked()
	{ return hoursWorked;}
	
	//Calculate employee's pay
	public double computePay()
	{
		totalPay = hourlyRate * hoursWorked;
		return totalPay;
	}
	
	// Default Constructor
	public Payroll()
	{
		fullName = ""; // Set name to blank
		hourlyRate = 0.0; // Set hourly rate to 0
		hoursWorked = 0; // Set hours worked to 0
		totalPay = 0.0; // Set total pay to 0
	}
	
	//Constructor that takes the employee's full name, hourly rate and hours worked
	public Payroll(String name, double rate, int worked)
	{
		fullName = name;
		hourlyRate = rate;
		hoursWorked = worked;
	}
	
	//Constructor that only takes the employee name
	public Payroll(String name)
	{
		fullName = name;
	}
	
	//Print the object's data
	public String toString()
	{
		// Create a string representing the object.
	      String str = "Full name: " + fullName +
	                   "\nHourly rate: $" + String.format("%.2f", hourlyRate) +
	                   "\nHours worked: " + hoursWorked +
	                   "\nTotal pay: $" + String.format("%.2f", totalPay) +
	                   "\n" ;

	      // Return the string.
	      return str;
	}
}
