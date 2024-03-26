//Author: Ana Victoria Gomes Mantovani
//Date: 11/05/2022
//Purpose: Calculate and display car rentals 

public class LuxuryCarRental extends CarRental
{
	//Initialize the chauffeur option
	private int chauffeur;
	
	//Set chauffeur's choice
	public void setChauff(int chauff)
	{ chauffeur = chauff; }
	
	//Get chauffeur's choice
	public int getChauff()
	{ return chauffeur; }
	
	//Constructor that takes name, zip, size, days and the chauffeur option
	//Overrides the CarRental constructor
	public LuxuryCarRental(String name, String zip, int size, int days,  int chauff)
	{
		super(name, zip, size, days);
		chauffeur = chauff;
	}
	
	//No-arg Constructor
	public LuxuryCarRental()
	{}
	
	//Overrides the CarRental total
	public double getTotalRentalFee()
	{
		if(chauffeur == 1)
		{
			//If user picks a chauffeur, add 200 to the fee
			totalRentalFee = getDailyRentalFee()*getRentalDays()+200;
			return totalRentalFee;
		}
		else
		{
			//If the users does not want a chauffeur just calculate the total rent fee 
			totalRentalFee = getDailyRentalFee()*getRentalDays();
			return totalRentalFee;
		}
	}
	
	//Overrides the CarRental display method 
	public String display()
	{
		String str;
		if (chauffeur == 1)
		{
			//If user chooses to have a chauffeur
			str = "Renter's name: " + getRenterName() +
				  "\nRenter's ZIP: " + getRenterZIP() + 
				  "\nRented car size: " + getRentedCarSize() +
			   	  "\nRented car daily fee: $" + String.format("%.2f", getDailyRentalFee()) + 
				  "\nDays rented: " + getRentalDays() +
				  "\nChauffeur fee: $200,00" +
				  "\n-----------------------------------" +
				  "\nTotal rental fee: $" + String.format("%.2f", getTotalRentalFee());
		}
		else
		{
			//If user does not want a chauffeur
			str = "Renter's name: " + getRenterName() +
				  "\nRenter's ZIP: " + getRenterZIP() + 
				  "\nRented car size: " + getRentedCarSize() +
				  "\nRented car daily fee: $" + String.format("%.2f", getDailyRentalFee()) + 
			   	  "\nDays rented: " + getRentalDays() +
			   	  "\n-----------------------------------" +
				  "\nTotal rental fee: $" + String.format("%.2f", getTotalRentalFee());
		}
		return str;
	}
}
