//Author: Ana Victoria Gomes Mantovani
//Date: 03/18/2023
//Project: Date Bubble Sort
//Description: Sort an array of random dates from lowest to highest and from highest to lowest

import java.util.Comparator;
import java.util.Date;

public class BubbleSortDate {
	
	public static void main(String[] args) {
        
		Date[] dates = new Date[9];
        
        // Generate and add 9 random Date objects to the array
		generateRandomDates(dates);
        
        //Display the original array
        System.out.println("Date array before sort: ");
        for (Date date : dates) {
            System.out.println(date);
        }
        System.out.println();
	    System.out.println();
	    
	    
	    
	  //Lowest to highest
	      
	    //Display the array sorted form lowest to highest
	    System.out.println("Array sorted from lowest to highest: ");
	      
	    //Sort the array from lowest to highest
	    bubbleSort(dates);
	      
	    for (Date date : dates) {
            System.out.println(date);
        }
	    System.out.println();
	    System.out.println();
	    
	    
	    
	    //Highest to lowest
	      
	    Comparator<Date> reverseComparator = new Comparator<Date>() {
            public int compare(Date date1, Date date2) {
                return date2.compareTo(date1);
            }
        };
        
        //Display the array sorted form highest to lowest
        System.out.println("Array sorted from highest to lowest: ");
		      
		//Sort the array from highest to lowest
		bubbleSortReverse(dates, reverseComparator);
		      
		for (Date date : dates) {
            System.out.println(date);
        }
		System.out.println();
		System.out.println();
    }
	
	
	//Method to generate 9 random dates
	public static void generateRandomDates(Date[] dates) {
        for (int i = 0; i < 9; i++) {
            dates[i] = new Date((long) (Math.random() * System.currentTimeMillis()));
        }
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
