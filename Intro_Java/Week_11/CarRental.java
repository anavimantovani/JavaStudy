//Author: Ana Victoria Gomes Mantovani
//Date: 11/05/2022
//Purpose: Calculate and display car rentals 

public class CarRental 
{
	//Declare private variables for name, zip, car size, daily fee, days rented and total fee
	private String renterName;
	private String renterZIP;
	private int rentedCarSize;
	private double dailyRentalFee;
	private int rentalDays;
	protected double totalRentalFee;
	
	//Constructor that takes name, zip, car size and days rented as arguments
	public CarRental (String name, String zip, int size, int days)
	{
		renterName = name;
		renterZIP = zip;
		rentedCarSize = size;
		rentalDays = days;
		
		if (size == 1)
		{ dailyRentalFee = 29.99;}
		else if (size == 2)
		{ dailyRentalFee = 38.99;}
		else if (size == 3)
		{ dailyRentalFee = 43.5;}
		else if (size == 4)
		{ dailyRentalFee = 79.99;}
	}
	
	//Constructor that takes only the car size
	public CarRental(int size)
	{ rentedCarSize = size; }
	 
	//No-arg constructor
	public CarRental()
	{  }
	
	//Set renter's name
	public void setRenterName(String name)
	{ renterName = name; }
	
	//Set renter's zip
	public void setRenterZIP(String zip)
	{ renterZIP = zip;}
	
	//Set renter's car size rented
	public void setRentedCarSize(int size)
	{ rentedCarSize = size; }
	
	//Set renter's daily renting fee
	public void setDailyRentalFee(double fee)
	{ dailyRentalFee = fee; }
	
	//Set renter's amount of days rented
	public void setRentalDays(int days)
	{ rentalDays = days; }
	
	//Get renter's name
	public String getRenterName()
	{ return renterName; }
	
	//Get renter's zip
	public String getRenterZIP()
	{ return renterZIP; }
	
	//Get renter's car size rented
	public int getRentedCarSize()
	{ return rentedCarSize; }
	
	//Get renter's daily renting fee
	public double getDailyRentalFee()
	{ return dailyRentalFee; }
	
	//Get renter's amount of days rented
	public int getRentalDays()
	{ return rentalDays; }
	
	//Calculate the total rental fee
	public double getTotalRentalFee()
	{
		totalRentalFee = dailyRentalFee*rentalDays;
		return totalRentalFee;
	}
	
	//Display the object's data to the user
	public String display()
	{
		
		String str = "Renter's name: " + renterName +
					 "\nRenter's ZIP: " + renterZIP + 
					 "\nRented car size: " + rentedCarSize +
					 "\nRented car daily fee: $" + String.format("%.2f", dailyRentalFee) + 
					 "\nDays rented: " + rentalDays +
					 "\n-----------------------------------" +
					 "\nTotal rental fee: $" + String.format("%.2f", getTotalRentalFee());
		
		return str;
	}
}
