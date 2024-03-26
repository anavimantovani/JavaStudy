//Author: Ana Victoria Gomes Mantovani
//Date: 12/15/2022
//Purpose: Store data about different candles

public class Candle {

	//Define the variables for color, height and price
	protected String color;
	protected int height;
	protected double price;
	
	//Define the constructor for the class
	public Candle(String cl, int h)
	{
		color = cl;
		height = h;
	}
	
	//Set a setColor method
	public void setColor(String cl)
	   {color = cl; }
	
	//Set a setHeight method
	public void setHeight(int h)
	   {
		height = h; 
		price = 2 * height;
		}
	
	//Set a getColor method
	public String getColor()
	   {return color;}
	
	//Set a getHeight method
	public double getHeight()
	   {return height;}
	
	//Set a getPrice method
	public double getPrice()
	   {return price;}
	
	//Transform the object data into a string for the output
	public String toString()
	{
		price = 2*height;
		String str = "Candle #1" +
				"\nColor:  " + color +
				"\nHeight: " + height + " inches" +
				"\nPrice:  $" + String.format("%.2f", price);
		return str;
	}
}

