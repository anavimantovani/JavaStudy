//Write to a file
//Manually inputting the fileName: Specifing the file location.

import java.io.*;
import java.util.Scanner; // Needed for the Scanner class
public class FileDemo2
{
     public static void main (String[] args) throws IOException
     {
	
	//to write to a file - you need PrintWriter class
    	 //\n
	PrintWriter outputFile = new PrintWriter("C:\\Users\\COD_User\\downloads\\deepa.txt");
	outputFile.println("Deepa Janakiraman");
	outputFile.println("Computer Information Sciences");
	outputFile.println("BIC 1535");
	outputFile.println("College of DuPage");
	outputFile.println("Glen Ellyn, IL");
	outputFile.close();
      }
}





	