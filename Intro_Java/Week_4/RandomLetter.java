//Author: Ana Victoria Gomes Mantovani
//Date: 09/16/2022
//Purpose: Generate a random lowercase letter

import java.util.Random;
public class RandomLetter {

	public static void main(String[] args) 
	{
		
		Random rand = new Random();

		char ch = (char)(rand.nextInt(26)+'a');
		System.out.println("Random character: " + ch);

	}

}
