//Author: Ana Victoria Gomes Mantovani
//Date: 02/17/2023

package demo;

import nusoft.utils.NuArrayList;
import java.util.Date;
import java.util.Random;

public class DateDemo {
    
    public static void main(String[] args) {
    	
        Random rand = new Random();
        
        // Generate and add 25 random dates to NuArrayList
        NuArrayList<Date> dateList = new NuArrayList<>();
        for (int i = 0; i < 25; i++) {
            dateList.add(new Date(System.currentTimeMillis() + rand.nextInt(100000000)));
        }

        //Print the array and the min and max values
        dateList.printVariables();
        System.out.println("Minimum value: " + dateList.min());
        System.out.println("Maximum value: " + dateList.max());
    }
}