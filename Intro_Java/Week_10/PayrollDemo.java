//Author: Ana Victoria Gomes Mantovani
//Date: 10/28/2022
//Purpose: Calculate the payroll

import javax.swing.JOptionPane;
public class PayrollDemo {

	public static void main(String[] args) 
	{
		//Initialize the array
		Payroll[] employee = new Payroll[5];
		
		//Data from first object
		employee[0] = new Payroll("Benjamin Harrison", 10.50, 40);
		employee[0].computePay(); //Calculate the pay
		
		//Data from first object
		employee[1] = new Payroll("Abraham Lincoln", 20.50, 30);
		employee[1].computePay(); //Calculate the pay
		
		//Data from first object
		employee[2] = new Payroll("Michael Scofield", 30.50, 20);
		employee[2].computePay(); //Calculate the pay
		
		//Data from first object
		employee[3] = new Payroll("Lincoln Burrows");
		employee[3].computePay(); //Calculate the pay
		
		//Data from first object
		employee[4] = new Payroll();
		employee[4].computePay(); //Calculate the pay
		
		//Display the results
		for (int i = 0; i < 5; i++)
		{
			JOptionPane.showMessageDialog(null, "Employee #" + (i+1) + ":" + "\n" + employee[i]);
		}
		
	}
	
}
