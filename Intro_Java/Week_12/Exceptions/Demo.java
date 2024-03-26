
public class Demo {

	public static void main(String[] args) {

		//only one try block, but multiple catch
		try
		{
			
			int a[] = new int [6];
			a[6] = 20; //program execution breaks here first
			int i = 9/0; //execution beaks
			
		}
		
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			//System.err.println("Stay in your limits.");
			System.err.println("Something went wrong. Please check.");
		}
		
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Stay in your limits.");
		}*/
		
		/*catch(ArithmeticException e)
		{
			System.err.println("Cannot divide by zero.");
		}*/
		
		finally
		{
			System.out.println("Bye");
		}

	}

}
