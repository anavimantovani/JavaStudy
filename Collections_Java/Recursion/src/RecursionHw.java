import java.util.Scanner;

//Author: Ana Victoria Gomes Mantovani
//Date: 02/09/2023

public class RecursionHw {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		//Prompt user for an integer
		System.out.println("Enter a non-negative integer: ");
		int num = input.nextInt();
       
		//Display the sum of the series from 1 to 10
        for (int x = 1; x <= num; x++){
            System.out.printf("M(%d) = %.3f \n", x, recursion(x));
        }
    }
    
	//Return the sum series
    static double recursion(double i){
        
        if(i == 1) { //Base Case
            return 1/i;
        }
        else {
            return 1/i + recursion(i-1); //Recursive call
        }    
    }
}
