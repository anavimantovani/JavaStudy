//Author: Ana Victoria Gomes Mantovani
//Date: 02/17/2023

package nusoft.utils;

import java.util.ArrayList;

public class NuArrayList<E extends Comparable<E>> {

	//Declare an array of type ArrayList<E>
    private ArrayList<E> NuArrayList;

    //Initialize the empty array
    public NuArrayList() {
    	this.NuArrayList = new ArrayList<E>();
    }

    //Add elements to the array
    public void add(E element) {
    	NuArrayList.add(element);
    }

    //Returns the minimum element of the array
    public E min() {
        E min = NuArrayList.get(0);
        for (E element : NuArrayList) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    //Returns the maximum element of the array
    public E max() {
        E max = NuArrayList.get(0);
        for (E element : NuArrayList) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
    
    //Prints all the variables in the array
    public void printVariables() {
        System.out.println("Variables in the list: ");
        for (E element : NuArrayList) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}