//Author: Ana Victoria Gomes Mantovani
//Date: 03/09/2023
//Project: Execution Time GCD
//Description: Obtain the execution time finding GCD of Fibonacci numbers with two different ways to find the GCD

package ExeTime;

public class ExeTimeGCD {

	public static void main(String[] args) {
        
		//Formating the output to look like a table
		System.out.println("Execution time for GCD in seconds: ");
		System.out.println();
		System.out.println("|-------------|---------|----------|----------|----------|----------|----------|");
		System.out.println("|    Index    |   40    |    41    |    42    |    43    |    44    |    45    |");
        System.out.println("|-------------|---------|----------|----------|----------|----------|----------|");
        System.out.print("|     GCD     |");
        
        //Initializing the variables to record the runtime of each index
        long startTime, endTime;
        double executionTime;
        
        //Loop to find the GCD and display the execution time of each index on the output table
        for (int i = 40; i <= 45; i++) {
            startTime = System.currentTimeMillis();
            gcd(fib(i), fib(i+1));
            endTime = System.currentTimeMillis();
            executionTime = (endTime - startTime) / 1000.0;
            System.out.printf(" %6.3f  | ", executionTime);
        }

        //Output table formating 
        System.out.println();
        System.out.println("|-------------|---------|----------|----------|----------|----------|----------|");
        System.out.print("|  GCD Euclid |");
        
        //Loop to find the GCD with Euclid method and display the execution time of each index on the output table
        for (int i = 40; i <= 45; i++) {
            startTime = System.currentTimeMillis();
            gcdEuclid(fib(i), fib(i+1));
            endTime = System.currentTimeMillis();
            executionTime = (endTime - startTime) / 1000.0;
            System.out.printf(" %6.3f  | ", executionTime);
        }
        
        //Output table formating
        System.out.println("\n|-------------|---------|----------|----------|----------|----------|----------|");
        System.out.println();
    }
	
	//Method to find the fibonacci number
	public static long fib(long index) {
	    if (index == 0) // Base case
	      return 0;
	    else if (index == 1) // Base case
	      return 1;
	    else  // Reduction and recursive calls
	      return fib(index - 1) + fib(index - 2);
	  }
	
	 //Method to find GCD for indexes
	  public static int gcd(long m, long l) {
	    int gcd = 1;
	    
	    if (m % l == 0) return (int) l;
	    
	    for (int k = (int) (l / 2); k >= 1; k--) {
	      if (m % k == 0 && l % k == 0) {
	        gcd = k;
	        break;
	      }
	    }
	    return gcd;
	  }
	  
	  //Method to find GCD for indexes, using Euclid's algorithm
	  public static int gcdEuclid(long l, long m) {
	    if (l % m == 0)
	      return (int) m;
	    else
	      return gcd(m, l % m);
	  }

}
