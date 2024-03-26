//Author: Ana Victoria Gomes Mantovani
//Date: 03/18/2023
//Project: Integer Bubble Sort
//Description: Sort an array of random integers from lowest to highest and from highest to lowest

import java.util.Comparator;
import java.util.Random;

public class BubbleSortInteger {

    public static void main(String[] args) {
        
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
        Comparator<Integer> reverseOrder = new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) 
            { return num2.compareTo(num1); }
        };
        
        // Display the array sorted from highest to lowest
        System.out.println("Array sorted from highest to lowest:");
        
        //Pass the array and the comparator object
        bubbleSortReverse(arrayInt, reverseOrder);
        
        ///Display the resorted array
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();
        
    }
    
    
    //Method to sort the array from lowest to highest
    public static <E extends Comparable<E>> void bubbleSort(E[] arraySort) {
        int arrayLength = arraySort.length;
        boolean swapped = true;
        
        //If the previous element is bigger than the current element, swap them
        while (swapped == true) {
            swapped = false;
            for (int i = 1; i < arrayLength; i++) {
                if (arraySort[i-1].compareTo(arraySort[i]) > 0) {
                    E temp = arraySort[i-1];
                    arraySort[i-1] = arraySort[i];
                    arraySort[i] = temp;
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
        
        //If the previous element is smaller than the current element, swap them
        while (swapped == true) {
        	swapped = false;
            for (int i = 1; i < arrayLength; i++) {
                if (comparator.compare(arrayReverse[i-1], arrayReverse[i]) > 0) {
                    E temp = arrayReverse[i-1];
                    arrayReverse[i-1] = arrayReverse[i];
                    arrayReverse[i] = temp;
                    swapped = true;
                }
            }
            arrayLength--;
        }
    }
    
}