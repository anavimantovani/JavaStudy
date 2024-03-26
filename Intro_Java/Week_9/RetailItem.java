//Author: Ana Victoria Gomes Mantovani
//Date: 10/20/2022
//Purpose: Hold data about items in a retail store

public class RetailItem {
	
	//Initialize the variables
	private String description;
	private int unitsOnHand;
	private double price;
	
	//Set the item's description
	public void setDescription(String itemDescription)
	{ description = itemDescription;}
	
	//Set the item's units
	public void setUnits(int units)
	{unitsOnHand = units;}
	
	//Set the item's price
	public void setPrice(double itemPrice)
	{price = itemPrice;}
	
	//Get the item's description
	public String getDescription()
	{return description;}
	
	//Get the item's units
	public int getUnits()
	{return unitsOnHand;}
	
	//Get the item's price
	public double getPrice()
	{return price;}
	
	//Create a constructor
	public RetailItem(String itemDescription, int units, double itemPrice)
	{
		description = itemDescription;
		unitsOnHand = units;
		price = itemPrice;
	}
	
	//no arg constructor
	public RetailItem()
	{
		description = "";
		unitsOnHand = 0;
		price = 0.0;
	}
}
