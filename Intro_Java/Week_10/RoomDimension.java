//Author: Ana Victoria Gomes Mantovani
//Date: 10/28/2022
//Purpose: Carpet calculator

public class RoomDimension 
  {
		//Initialize length and width
        private double length;
        private double width;

        //Constructor
        public RoomDimension(double length, double width) 
        {
            this.length = length;
            this.width = width;
        } 
        
        //Get the length
        public double getLength() 
        {
            return length;
        }

        //Get the width
        public double getWidth() 
        {
            return width;
        }

        //Calculate the area
        public double getArea() 
        {
            return length * width;
        }
        
        //Turn object into string
        public String toString() 
        {
        	String str = "Dimensions of room: " +
            			 "\nLength = " + length + 
            			 "\nWidth = " + width + "\n";
        	
            return str;
        }

   }