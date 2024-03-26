//Author: Ana Victoria Gomes Mantovani
//Date: 02/17/2023

package demo;

import nusoft.utils.NuArrayList;
import java.util.Random;

public class IntDemo {
    
    public static void main(String[] args) {
    	
        // Generate and add 25 random integers to NuArrayList
        NuArrayList<Integer> intList = new NuArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            intList.add(rand.nextInt(100));
        }
        
        //Print the array and the min and max values
        intList.printVariables();
        System.out.println("Minimum value: " + intList.min());
        System.out.println("Maximum value: " + intList.max());
    }
}