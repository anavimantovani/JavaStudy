//Appending Data to a file

import java.io.*;
import java.util.Scanner; // Needed for the Scanner class
public class FileDemo3
{
     public static void main (String[] args) throws IOException
     {
	//create FileWriter object, if the file does not exist, it will be created.	
	FileWriter fwriter = new FileWriter("deepa.txt", true);
	PrintWriter outputFile = new PrintWriter(fwriter);
	outputFile.println("630-540-2599");
	outputFile.close();
      }
}




	