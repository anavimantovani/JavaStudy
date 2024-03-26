package class3;
import java.util.Scanner;
public class IfElseNested {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter our annual salary: $");
		int salary = keyboard.nextInt();
		System.out.println("Enter the number of years worked:");
		int years = keyboard.nextInt();
		
		if((salary >= 50000) && (years > 2))
			System.out.println("Yay! You qualify!");
		else
			System.out.println("Sorry, you don't qualify");
		

	}

}
