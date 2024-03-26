package class3;

import java.util.Scanner;
import java.util.Random;
public class GenerateRandomNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
		
		int number1 = rand.nextInt(100) + 1;
		System.out.println("Random number bet 1 and 100: " + number1);
		
		int number2 = rand.nextInt(100);
		System.out.println("Random number bet 1 and 100: " + number2);
		
		int number3 = rand.nextInt(100) - 50;
		System.out.println("Random number bet 1 and 100: " + number3);

	}

}
