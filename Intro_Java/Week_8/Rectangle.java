/*Ana Victoria Gomes Mantovani
 * Oct 13, 2022
 * Create a basic rectangle class.
 */

public class Rectangle 
{
	private double length; //length of rectangle
	private double width; //width of rectangle
	
	// stores the value len in the length field
	public void setLength(double len) //don't add the static, they are instance methods
	// instance is an object
	{
		length = len;
	}
	
	// stores the value wid in the width field
	// set methods (store a value) are called mutators
	public void setWidth(double wid) 
	{
		width = wid;
	}
	
	// returns the rectangle objects length
	public double getLength()
	{ return length; }
	
	// returns the rectangle objects width
	// get methods are called accessors
	public double getWidth()
	{ return width; }
	
	public double getArea()
	{ return length*width; }
	
	//constructor
	public Rectangle(double len, double wid)
	{
		length = len;
		width = wid;
	}
	
	// no-arg constructor or default constructor
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
}
