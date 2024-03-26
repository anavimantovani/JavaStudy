//Author: Ana Victoria Gomes Mantovani
//Date: 11/18/2022
//Purpose: Display a book's data

public abstract class Book {
    
	//Create the variables book title and price
	String bookTitle;
    double price;      
    
    //Create the constructor
    public Book(String title)
    { bookTitle = title;}
    
    //Get the title of the book
    public String getTitle()
    { return bookTitle; }
    
    //Get the price of the book
    public double getPrice(){
        return price;}
    
    //Set the title of the book
    public void setTitle(String book)
    { bookTitle = book;}
    
    //Create the setPrice method
    public abstract void setPrice();
    
  //Transform the object data into a string
    public String toString(String title)
    {
    	String str = "Book genre: -" +
    			"Book title: " + bookTitle +
				"\nBook price: $" + price;
    	
    	return str;
    }
}