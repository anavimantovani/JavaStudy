
import java.util.Scanner;
public class RectangleDemo {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter width of Kitchen: ");
		double kWid = keyboard.nextDouble();
		System.out.println("Enter length of Kitchen: ");
		double kLen = keyboard.nextDouble();
		
		Rectangle kitchen = new Rectangle(kLen, kWid);// creating an object called kitchen
		//kitchen.setLength(10); needed when you don't have a constructor
		//kitchen.setWidth(5);
		
		Rectangle patio = new Rectangle(8, 8); //arguments inside mean there is a constructor on the class
		//patio.setLength(8);needed when you don't have a constructor
		//patio.setWidth(8);
		
		Rectangle sunRoom = new Rectangle(); //uses the default(no-arg) constructor
		sunRoom.setLength(3);
		sunRoom.setWidth(5);
		
		System.out.println("The kitchen's length is: " + kitchen.getLength());
		System.out.println("The kitchen's width is: " + kitchen.getWidth());
		System.out.println();
		System.out.println("The patio's length is: " + patio.getLength());
		System.out.println("The patio's width is: " + patio.getWidth());
		
		

	}

}
