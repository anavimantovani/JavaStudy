//Author: Ana Victoria Gomes Mantovani
//Date: 11/18/2022
//Purpose: Display a book's data

public class Friction extends Book{

	//Create the constructor
    public Friction(String title) {
        super(title);
        setPrice();
    }
    
    //Set the book's price
    public void setPrice(){
        super.price = 24.99;
    }
    
    //Transform the object data into a string
    public String toString()
    {
    	String str = "Book genre: Fiction" +
				"\nBook title: " + bookTitle +
				"\nBook price: $" + price;
    	return str;
    }
}