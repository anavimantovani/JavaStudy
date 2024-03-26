//Author: Ana Victoria Gomes Mantovani
//Date: 10/20/2022
//Purpose: Hold data about items in a retail store

public class RetailItemDemo {

	public static void main(String[] args) 
	{
		// Create item jacket that uses the no arg constructor
		RetailItem jacket = new RetailItem(); 
		jacket.setDescription("Jacket"); //Set description
		jacket.setUnits(12); //Set units
		jacket.setPrice(59.95); // Set price
		
		//Create item Designer Jeans
		RetailItem designerJeans = new RetailItem("Designer Jeans", 40, 34.95);
		
		//Create item Shirt
		RetailItem shirt = new RetailItem("Shirt", 20, 24.95);
		
		//Display data about item #1
		System.out.println("Item #1:");
		System.out.println("Item name:      " + jacket.getDescription());
		System.out.println("Units in hand:  " + jacket.getUnits());
		System.out.println("Item price:     $" + jacket.getPrice());
		System.out.println();
		
		//Display data about item #2
		System.out.println("Item #2:");
		System.out.println("Item name:      " + designerJeans.getDescription());
		System.out.println("Units in hand:  " + designerJeans.getUnits());
		System.out.println("Item price:     $" + designerJeans.getPrice());
		System.out.println();
		
		//Display data about item #3
		System.out.println("Item #3:");
		System.out.println("Item name:      " + shirt.getDescription());
		System.out.println("Units in hand:  " + shirt.getUnits());
		System.out.println("Item price:     $" + shirt.getPrice());
		System.out.println();
		

	}

}
