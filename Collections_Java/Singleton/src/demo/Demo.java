package demo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	
	public static void main(String[] args) {
	    // Create a hash set
	    Set<Double> set = new HashSet<>();
	    
	    for(int i=0; i<25; i++) {
	    	set.add((Math.random() * 100) - 25.0);
	    }
	    
	    //Print set
	    for(Double dblVal : set) {
	    	 System.out.printf("%8.3f ", dblVal.doubleValue());
	    }
	    System.out.println();
	    
	    
	    //Sort the set
	    TreeSet<Double> sortedSet1 = new TreeSet<>(set);
	    for(Double dblVal : sortedSet1) {
	    	 System.out.printf("%8.3f ", dblVal.doubleValue());
	    }
	    System.out.println();
	    
	    
	    //Sort set backwards
	    TreeSet<Double> sortedSet2 = new TreeSet<>(new DoubleComparator());
	    sortedSet2.addAll(set);
	    for(Double dblVal : sortedSet2) {
	    	 System.out.printf("%8.3f ", dblVal.doubleValue());
	    }
	    
	}

}
