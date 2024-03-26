package demo;

import java.util.Comparator;

public class DoubleComparator implements Comparator<Double>{

	@Override
	public int compare(Double o1, Double o2) {
		
		int result = o1.compareTo(o2);
		
		if(result == 0 )
			return 0;
		else
			return -result;
	}

}
