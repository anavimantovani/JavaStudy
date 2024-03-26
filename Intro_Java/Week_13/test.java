
public class test {
	
	public static void main(String[] args) {
		
		Rectangle box1 = new Rectangle(20,10);
		
		if (box1 instanceof Rectangle)
			System.out.println("yes, box1 is a Rectangle");
		else
			System.out.println("no, box1 isn't a Rectangle");

	}
}
