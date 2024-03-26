
public class comparearray {

	public static void main(String[] args) 
	{
		
		int[] firstA = {2,4,6,8,10};
		int[] secondA = {2,4,6,8,10};
		
		boolean arrayEquals = true;
		int index = 0;
		
		if (firstA.length != secondA.length)
			arrayEquals = false;
		
		
		while(arrayEquals && index<firstA.length)
		{
			if(firstA[index] != secondA[index])
				arrayEquals = false;
			index++;
		}
		
		if(arrayEquals)
			System.out.println("They are equal.");
		else
			System.out.println("They are not equal.");

	}

}
