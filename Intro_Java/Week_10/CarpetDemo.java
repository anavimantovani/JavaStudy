//Author: Ana Victoria Gomes Mantovani
//Date: 10/28/2022
//Purpose: Carpet calculator

import javax.swing.JOptionPane;
public class CarpetDemo {

	public static void main(String[] args) {

		//Prompt user for the length of the room
		String roomLength;
		roomLength = JOptionPane.showInputDialog( "Enter the length of the room: ");
		int length = Integer.parseInt(roomLength);
	    
		//Prompt user for the width of the room
		String roomWidth;
		roomWidth = JOptionPane.showInputDialog( "Enter the width of the room: ");
		int width = Integer.parseInt(roomWidth);

		//Prompt user for the cost of the carpet per square feet
		String priceCarpet;
		priceCarpet = JOptionPane.showInputDialog( "Enter the price per square feet: ");
		int price = Integer.parseInt(priceCarpet);
		
		//Store the input data
		RoomDimension roomDimensions = new RoomDimension(length, width);
		RoomCarpet roomCarpet = new RoomCarpet(roomDimensions, price);
	   
		//Display the results
		JOptionPane.showMessageDialog(null, roomCarpet);
	}
}
