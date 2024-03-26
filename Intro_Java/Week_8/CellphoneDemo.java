
import java.util.Scanner;
public class CellphoneDemo {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		Cellphone iPhone = new Cellphone("Apple", 123, 12.2);
		Cellphone Galaxy = new Cellphone("Samsung", 345, 15.2);
		Cellphone Pixel = new Cellphone("Google", 786, 13.2);

		System.out.println("The phone manufacturer is: " + iPhone.getManufact());
		System.out.println("The phone model is: " + iPhone.getModel());
		System.out.println("The phone retail price is: " + iPhone.getRetailPrice());
		
	}

}
