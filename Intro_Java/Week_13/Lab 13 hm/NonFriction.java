//Author: Ana Victoria Gomes Mantovani
//Date: 11/18/2022
//Purpose: Display a book's data

public class NonFriction extends Book{

	//Create the constructor
    public NonFriction(String title) {
        super(title);
        setPrice();
    }
    
    //Set the book's price
    public void setPrice(){
        super.price = 37.99;
    }
    
    //Transform the object data into a string
    public String toString()
    {
    	String str = "Book genre: Non Fiction" +
    				"\nBook title: " + bookTitle +
    				"\nBook price: $" + price;
    	return str;
    }
}