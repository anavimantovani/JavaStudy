//Author: Ana Victoria Gomes Mantovani
//Date: 03/18/2023
//Project: String Bubble Sort
//Description: Sort an array of random strings from lowest to highest and from highest to lowest

import java.util.Comparator;
import java.util.Random;

public class BubbleSortString {
	
	public static void main(String[] args) {
	      
		  //Generate 9 random strings with random characters and random lenghts
		  int numStrings = 9;
	      String[] randomStrings = generateRandomStrings(numStrings);

	      //Display the original array
	      System.out.println("String array before sort: ");
	      for (int i = 0; i < numStrings; i++) {
	         System.out.print(randomStrings[i] + " ");
	      }
	      System.out.println();
	      System.out.println();
	      
	      
	      //Lowest to highest
	      
	      //Display the array sorted form lowest to highest
	      System.out.println("Array sorted from lowest to highest: ");
	      
	      //Sort the array from lowest to highest
	      bubbleSort(randomStrings);
	      
	      for (int i = 0; i < numStrings; i++) {
	         System.out.print(randomStrings[i] + " ");
	      }
	      System.out.println();
	      System.out.println();
	      
	      
	      
	      //Highest to lowest
	      
	      Comparator<String> reverseComparator = new Comparator<String>() {
	            public int compare(String s1, String s2) {
	                return s2.compareTo(s1);
	            }
	        };
	        
	      //Display the array sorted form highest to lowest
		  System.out.println("Array sorted from highest to lowest: ");
		      
		  //Sort the array from highest to lowest
		  bubbleSortReverse(randomStrings, reverseComparator);
		      
		  for (int i = 0; i < numStrings; i++) {
			  System.out.print(randomStrings[i] + " ");
		  }
		  System.out.println();
		  System.out.println();
	      
	   }

	   //Method to generate 9 strings of random characters and random lengths (more than 4 characters)
	   public static String[] generateRandomStrings(int numStrings) {
	      Random rand = new Random();
	      String[] randomStrings = new String[numStrings];

	      for (int i = 0; i < numStrings; i++) {
	         int length = rand.nextInt(10) + 5;
	         StringBuilder sb = new StringBuilder();
	         for (int j = 0; j < length; j++) {
	            char c = (char)(rand.nextInt(26) + 'a');
	            sb.append(c);
	         }
	         randomStrings[i] = sb.toString();
	      }

	      return randomStrings;
	   }
	   
	   //Method to sort the array from lowest to highest
	   public static <E extends Comparable<E>> void bubbleSort(E[] arraySort) {
		      int arrayLength = arraySort.length;
		      boolean swapped = true;
		      while (swapped) {
		         swapped = false;
		         for (int i = 1; i < arrayLength; i++) {
		            if (arraySort[i - 1].compareTo(arraySort[i]) > 0) {
		               E temp = arraySort[i];
		               arraySort[i] = arraySort[i - 1];
		               arraySort[i - 1] = temp;
		               swapped = true;
		            }
		         }
		         arrayLength--;
		      }
		   }
	   
	   //Method to sort the array from highest to lowest
	   public static <E> void bubbleSortReverse(E[] arrayReverse, Comparator<? super E> comparator) {
	        int arrayLength = arrayReverse.length;
	        boolean swapped = true;
	        while (swapped) {
	            swapped = false;
	            for (int i = 1; i < arrayLength; i++) {
	                if (comparator.compare(arrayReverse[i - 1], arrayReverse[i]) > 0) {
	                    E temp = arrayReverse[i];
	                    arrayReverse[i] = arrayReverse[i - 1];
	                    arrayReverse[i - 1] = temp;
	                    swapped = true;
	                }
	            }
	            arrayLength--;
	        }
	    }

}
