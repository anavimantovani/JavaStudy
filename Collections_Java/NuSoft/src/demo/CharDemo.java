//Author: Ana Victoria Gomes Mantovani
//Date: 02/17/2023

package demo;

import nusoft.utils.NuArrayList;
import java.util.Random;

public class CharDemo {
    
    public static void main(String[] args) {
    	
        Random rand = new Random();
        // Generate and add 25 random characters to NuArrayList
        NuArrayList<Character> charList = new NuArrayList<>();
        for (int i = 0; i < 25 ; i++) {
            charList.add((char)(rand.nextInt(26) + 'a'));
        }
        
        //Print the array and the min and max values
        charList.printVariables();
        System.out.println("Minimum value: " + charList.min());
        System.out.println("Maximum value: " + charList.max());
    }
}