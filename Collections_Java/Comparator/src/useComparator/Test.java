//Author: Ana Victoria Gomes Mantovani
//Date: 02/23/2002

package useComparator;

import java.util.Comparator;

public class Test {
	
	public static void main(String[] args) {
		
		//Create an array of objects
        GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5),  new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), 
        		                   new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1), new Circle(6.5), new Rectangle(4, 5)};
        
        //Sort the array based on the area of each element
        selectionSort(list1, new GeometricObjectComparator());
        
        //Display the sorted elements
        System.out.println("List1 elements sorted by the area:");
        System.out.println();
        for (int i = 0; i < list1.length; i++) {
            GeometricObject o = list1[i];
            System.out.printf("%.3f\n", o.getArea());
        }
        
        //Create an array of strings
        String[] list2 = {"red", "blue", "green", "yellow", "orange", "pink"};
        
        //Sort the elements based on the last character of each string
        selectionSort(list2, new LastCharComparator());
        
        //Display the sorted strings
        System.out.println();
        System.out.println();
        System.out.println("List2 elements sorted by the last character:");
        System.out.println();
        for (int m = 0; m < list2.length; m++) {
            System.out.println(list2[m]);
        }
    }
	
	//Selection sort method to compare the area of the objects in the array
	public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
        
		//Loop over every object and compare to the current smallest
		for (int k = 0; k < list.length - 1; k++) {
            int smallerArea = k;
            for (int j = k + 1; j < list.length; j++) {
                if (comparator.compare(list[j], list[smallerArea]) < 0) {
                	smallerArea = j;
                }
            }
            
            //If the program find a new smallest, store it
            if (smallerArea != k) {
                E temp = list[k];
                list[k] = list[smallerArea];
                list[smallerArea] = temp;
            }
        }
    }
	
	//Comparator to compare the last character of each string
	public static class LastCharComparator implements Comparator<String> {
	    
		public int compare(String s1, String s2) {
	       
			//Compae the last character and return the result
			char charString1 = s1.charAt(s1.length() - 1);
	        char charString2 = s2.charAt(s2.length() - 1);
	        if (charString1 < charString2) {
	            return -1;
	        } else if (charString1 > charString2) {
	            return 1;
	        } else {
	            return 0;
	        }
	   }
	}
}
