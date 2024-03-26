//Author: Ana Victoria Gomes Mantovani
//Date: 11/18/2022
//Purpose: Display a book's data

import javax.swing.JOptionPane;
public class BookArray{

	public static void main(String[] args) {
		
		//Create an array of 10 elements
		Book displayBooks[] = new Book[10]; 
        
		//Create 10 objects books that are fiction
		displayBooks[0] = new Friction("The Lord of the Rings");
		displayBooks[1] = new Friction("Throne of Glass");
		displayBooks[2] = new Friction("Harry Potter");
		displayBooks[3] = new Friction("Ready Player 1");
		displayBooks[4] = new Friction("Percy Jackson");
		
		//Create 10 objects books that are non fiction
		displayBooks[5] = new NonFriction("The art of Programming");
		displayBooks[6] = new NonFriction("Silent Spring");
		displayBooks[7] = new NonFriction("The diary of a Young Girl");
		displayBooks[8] = new NonFriction("The Double Helix");
		displayBooks[9] = new NonFriction("Sapiend: A Brief History of Humankind");
		
		//Display the 10 object booksz
        for (int index = 0; index < 10; index++)
        	{
        	JOptionPane.showMessageDialog(null, "Book #" + (index+1) + ": \n" + displayBooks[index]);
        	}
	}
}


