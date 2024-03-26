import java.util.Random;
import java.util.Scanner;
public class Ch4 {

	public static void main(String[] args) 
	{

		/* System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(3, 2));	
		System.out.println(Math.sqrt(4));	
		
		System.out.println("Ceiling of 2.1: " + Math.ceil(2.1));
		System.out.println("Ceiling of -2.1: " + Math.ceil(-2.1));

		System.out.println("Floor of 2.1: " + Math.floor(2.1));
		System.out.println("Floor of -2.1: " + Math.floor(-2.1));

		System.out.println("Round of 2.1: " + Math.round(2.1));
		System.out.println("Round of -3.6: " + Math.round(-3.6));
		
		System.out.println("Max of 3 and 10 is: " + Math.max(3, 10));
		System.out.println("Min of 3 and 10 is: " + Math.min(3, 10)); */
		
		//char ch = 'a';
		//System.out.println(++ch); //preincrement
		//System.out.println(ch++); // postincrement
		
		/* String name = "Anna Gomes";
		String upCaseName = name.toUpperCase();
		System.out.println("Name in UpperCase: " + upCaseName);
		
		String lowCaseName = name.toLowerCase();
		System.out.println("Name in LowerCase: " + lowCaseName);
		
		int length = name.length();
		System.out.println("My name has " + length + " characters.");
		
		char ch = name.charAt(3);
		System.out.println("The character in 4th place is: " + ch); */
		
		//String s = "Chapter" + 2;
		//System.out.println(s);
		
		//String s = "\"Hello\", I am Deepa";
		//System.out.println(s);
		
		//System.out.println("\tHe said \n\"Hello\"\n");
		//System.out.println("\t It beeps! \\ \n"); //page 128
		
		/* String name1 = "Mark";
		String name2 = "Mark";
		String name3 = "Mary";
		
		if(name1.equals(name2))
			System.out.println(name1 + " and " + name2 + " are the same!");
		else
			System.out.println(name1 + " and " + name2 + " are the different!");
		
		if(name1.equals(name3))
			System.out.println(name1 + " and " + name3 + " are the same!");
		else
			System.out.println(name1 + " and " + name3 + " are the different!");

		if(name1.compareTo(name3) < 0) //page 135
			System.out.println(name1 + " is less than " + name3);
		else
			System.out.println(name3 + " is less than " + name1); */
		
		/*int count = 5;
		double amount = 3.144447; // page 147
		System.out.printf("count is %d and amount is %.2f", count, amount);
		System.out.println();
		
		int n = 1234;
		System.out.printf("%08d", n);*/
		
		/*Random rand = new Random();
		
		//generates a random number between 1 and 10
		int n = rand.nextInt(10)+1;
		System.out.println("Random number beween 1-10: " + n); 
		
		//generates a random character
		char ch = (char)(rand.nextInt(26)+'a');
		System.out.println("Random character: " + ch);
		
		String s = "abcdef";
		char c = s.charAt(rand.nextInt(s.length()));
		System.out.println("Random character from abcdef: " + c);*/
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		
		if (Character.toUpperCase(letter) == 'A' || Character.toUpperCase(letter) == 'E' || Character.toUpperCase(letter) == 'I' || Character.toUpperCase(letter) == 'U' || Character.toUpperCase(letter) == 'O')
			System.out.println(letter + " is a vowel.");
		else if (Character.isLetter(letter))
			System.out.println(letter + " is a consonant.");
		else
			System.out.println(letter + " is an invalid input.");




		
	}

}
