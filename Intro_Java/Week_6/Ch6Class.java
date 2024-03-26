
import javax.swing.JOptionPane;
public class Ch6Class {

	public static void main(String[] args) 
	{
		displayResults(cupsToOunces(getCups()));
	}
	
	public static double getCups()
	{
		String cups;
		Double totalCups = 0.0;
		cups = JOptionPane.showInputDialog("Enter the number of cups: ");
		totalCups = Double.parseDouble(cups);
        return totalCups;
	}
	
	public static double cupsToOunces(double cups)
	{
		double totalOunces = 0;
		totalOunces = cups * 8;
		return totalOunces;
	}
	
	public static void displayResults(double ounces)
	{
		JOptionPane.showMessageDialog(null, "The total ounces is: " + String.format("%.2f", ounces));
	}

}