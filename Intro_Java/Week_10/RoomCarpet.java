//Author: Ana Victoria Gomes Mantovani
//Date: 10/28/2022
//Purpose: Carpet calculator

public class RoomCarpet 
	{
		//Initialize variables
		private RoomDimension roomDimensions;
        private double carpetCost;

        //Constructor
        public RoomCarpet(RoomDimension roomDimensions, double carpetCost) 
        {
            this.roomDimensions = roomDimensions;
            this.carpetCost = carpetCost;
        }

        //Calculate the total cost
        public double getTotalCost() 
        {
            return carpetCost * roomDimensions.getArea();
        }

        //Get size of the room
        public RoomDimension getSize()
        {
            return roomDimensions;
        }

        //Get carpet cost
        public double getCarpetCost()
        {
            return carpetCost;
        }
        
        //Turn object into string
        public String toString() 
        {
        	String str = roomDimensions + "Carpet cost per square feet = $" + String.format("%.2f", carpetCost) +
        			"\nTotal cost = $" + String.format("%.2f", getTotalCost()) + "\n";
            
        	return str;
        }

    }
