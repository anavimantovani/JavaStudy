//Author: Ana Victoria Gomes Mantovani
//Date: 11/18/2022
//Purpose: Display a book's data

public class UseBook {
    
	public static void main(String[] args){
        
		//Create a object book
		Book books;
        
		//Create a fiction book object
		books = new Friction("The Lord of the Rings");
        System.out.println(books.toString());
        System.out.println();
        
        //Create a non fiction book object
        books=new NonFriction("The art of Programming");
        System.out.println(books.toString());
    }
}