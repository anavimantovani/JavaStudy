//Author: Ana Victoria Gomes Mantovani
//Date: 03/19/2023
//Project: Generic Bubble Sort
//Description: Sort arrays of random integers, strings and dates from lowest to highest and from highest to lowest

import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class GenericBubbleSort {

  public static void main(String[] args) {
   
// --- Integer ---
	
	    System.out.println("Integers");
	    System.out.println();
	
	    // Generate 9 random integers and add them to an array
	    Integer[] arrayInt = new Integer[9];
	    Random rand = new Random();
	    for (int i = 0; i < arrayInt.length; i++) {
	      arrayInt[i] = rand.nextInt(100);
	    }
	
	    // Display the original array
	    System.out.println("Integer array before sort:");
	    for (int i = 0; i < arrayInt.length; i++) {
	      System.out.print(arrayInt[i] + " ");
	    }
	    System.out.println();
	    System.out.println();
	
	    //Lowest to highest
	
	    //Display the array sorted form lowest to highest
	    System.out.println("Array sorted from lowest to highest:");
	
	    //Pass the array to the sorting method
	    bubbleSort(arrayInt);
	
	    //Display the sorted array
	    for (int i = 0; i < arrayInt.length; i++) {
	      System.out.print(arrayInt[i] + " ");
	    }
	    System.out.println();
	    System.out.println();
	
	    //Sort array from Highest to lowest
	
	    //Comparator object to sort the array from highest to lowest
	    Comparator<Integer> reverseOrderInt = new Comparator<Integer>() {
	      public int compare(Integer num1, Integer num2) {
	        return num2.compareTo(num1);
	      }
	    };
	
	    // Display the array sorted from highest to lowest
	    System.out.println("Array sorted from highest to lowest:");
	
	    //Pass the array and the comparator object
	    bubbleSortReverse(arrayInt, reverseOrderInt);
	
	    ///Display the resorted array
	    for (int i = 0; i < arrayInt.length; i++) {
	      System.out.print(arrayInt[i] + " ");
	    }
	    System.out.println();
	    System.out.println();
	    System.out.println();
	
	    
// --- String ---
	
	    System.out.println("Strings");
	    System.out.println();
	
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
	
	    Comparator<String> reverseComparatorStr = new Comparator<String>() {
	      public int compare(String s1, String s2) {
	        return s2.compareTo(s1);
	      }
	    };
	
	    //Display the array sorted form highest to lowest
	    System.out.println("Array sorted from highest to lowest: ");
	
	    //Sort the array from highest to lowest
	    bubbleSortReverse(randomStrings, reverseComparatorStr);
	
	    for (int i = 0; i < numStrings; i++) {
	      System.out.print(randomStrings[i] + " ");
	    }
	    System.out.println();
	    System.out.println();
	    System.out.println();
	
	    
// --- Date ---
	
	    System.out.println("Dates");
	    System.out.println();
	
	    // Generate and add 9 random Date objects to the array
	    int numDates = 9;
	    Date[] dates = new Date[numDates];
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
	
	    Comparator<Date> reverseComparatorDate = new Comparator<Date>() {
	      public int compare(Date date1, Date date2) {
	        return date2.compareTo(date1);
	      }
	    };
	
	    //Display the array sorted form highest to lowest
	    System.out.println("Array sorted from highest to lowest: ");
	
	    //Sort the array from highest to lowest
	    bubbleSortReverse(dates, reverseComparatorDate);
	
	    for (Date date : dates) {
	      System.out.println(date);
	    }
  }

	  //Method to sort the array from lowest to highest
	  public static <E extends Comparable<E>> void bubbleSort(E[] arraySort) {
	    int arrayLength = arraySort.length;
	    boolean swapped = true;
	
	    //If the previous element is bigger than the current element, swap them
	    while (swapped == true) {
	      swapped = false;
	      for (int i = 1; i < arrayLength; i++) {
	        if (arraySort[i - 1].compareTo(arraySort[i]) > 0) {
	          E temp = arraySort[i - 1];
	          arraySort[i - 1] = arraySort[i];
	          arraySort[i] = temp;
	          swapped = true;
	        }
	      }
	      arrayLength--;
	    }
  }

	  //Method to sort the array from highest to lowest
	  public static <E> void bubbleSortReverse(
	    E[] arrayReverse,
	    Comparator<? super E> comparator
	  ) {
	    int arrayLength = arrayReverse.length;
	    boolean swapped = true;
	
	    //If the previous element is smaller than the current element, swap them
	    while (swapped == true) {
	      swapped = false;
	      for (int i = 1; i < arrayLength; i++) {
	        if (comparator.compare(arrayReverse[i - 1], arrayReverse[i]) > 0) {
	          E temp = arrayReverse[i - 1];
	          arrayReverse[i - 1] = arrayReverse[i];
	          arrayReverse[i] = temp;
	          swapped = true;
	        }
	      }
	      arrayLength--;
	    }
  }

	  //Method to generate 9 strings of random characters and random lengths (more than 4 characters)
	  public static String[] generateRandomStrings(int numStrings) {
	    Random rand = new Random();
	    String[] randomStrings = new String[numStrings];
	
	    for (int i = 0; i < numStrings; i++) {
	      int length = rand.nextInt(10) + 5;
	      StringBuilder sb = new StringBuilder();
	      for (int j = 0; j < length; j++) {
	        char c = (char) (rand.nextInt(26) + 'a');
	        sb.append(c);
	      }
	      randomStrings[i] = sb.toString();
	    }
	
	    return randomStrings;
	  }

	  //Method to generate 9 random dates
	  public static void generateRandomDates(Date[] dates) {
	    for (int i = 0; i < 9; i++) {
	      dates[i] = new Date((long) (Math.random() * System.currentTimeMillis()));
	    }
	  }
}
