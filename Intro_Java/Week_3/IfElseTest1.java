package class3;

import java.util.Scanner;
public class IfElseTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter test score #1:");
		double score1 = input.nextDouble();
		System.out.println("Enter test score #2:");
		double score2 = input.nextDouble();
		System.out.println("Enter test score #3:");
		double score3 = input.nextDouble();
		
		double average = (score1 + score2 + score3) / 3;
		
		if (average >= 90)
			System.out.println("Good Job.");
		else
			System.out.println("Need to improve");
	
		
	}

}
