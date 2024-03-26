//Author: Ana Victoria Gomes Mantovani
//Date: 12/15/2022
//Purpose: Store data about different candles

public class ScentedCandle extends Candle {
	
	//Define the variable scent
	private String scent;
	
	//Inherit the color and height methods from the parent class and add the scent to the constructor
	public ScentedCandle(String cl, int h, String sc) {
		super(cl, h);
		scent = sc;
	}

	//Set a getScent method
	public String getScent()
	   {return scent;}
	
	//Set a setScent method
	public void setScent(String sc)
	   {scent = sc; }
	
	//Override the setHeight method
	public void setHeight(int h)
	   {
		height = h; 
		price = 3 * h;
		}
	
	//Transform the object data into a string for the output
	public String toString()
	{
		price = 3*height;
		String str = "Candle #2" +
				"\nColor:  " + color +
				"\nHeight: " + height + " inches" +
				"\nScent:  " + scent +
				"\nPrice:  $" + String.format("%.2f", price);
		return str;
	}

}
