//Author: Ana Victoria Gomes Mantovani
//Date: 02/09/2023

public class RecursionTest {

	public static void main(String args[]) {
        
		//Display the sum of the series from 1 to 10
        for (int x = 1; x <= 10; x++){
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
