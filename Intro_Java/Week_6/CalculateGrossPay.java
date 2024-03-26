//Author: Ana Victoria Gomes Mantovani
//Date: 09/29/22
//Purpose: Calculate the gross pay of employees

import javax.swing.JOptionPane;
public class CalculateGrossPay
{

	public static void Main(String[] args)
	{
		int counter = 0;
	    String employeeCount;
	    employeeCount = JOptionPane.showInputDialog( "Enter the number of employees: ");
		int empCount = Integer.parseInt(employeeCount);
	    
		do
		{
			String name, social, hours, rates;
			int empHours = 0;
		    double empRate;
			name = JOptionPane.showInputDialog("Enter employee's full name: ");
	        social = JOptionPane.showInputDialog("Enter employee's SSN: ");
	        hours = JOptionPane.showInputDialog("Enter the number of hours worked: ");
	        empHours = Integer.parseInt(hours);
	        rates = JOptionPane.showInputDialog("Enter the employee's rate of pay:");
			empRate = Double.parseDouble(rates);
				
			counter ++;
			displayPay(name, empHours, computePay(empHours, empRate));
		}
		while(empCount > counter );
		
	}
	
	public static double computePay(int hrs, double rate)
	{ 
		double pay, normal;
	    if(hrs > 40)
	    {
	        hrs = hrs - 40;
	        normal = rate * 40;
	        pay = ((rate * 1.5) * hrs) + normal;
	    }
	    else
	    	pay = hrs * rate;
			
	    return pay;
	}
		
	public static void displayPay(String fullname, int hoursWorked, double grossPay)
	{
		JOptionPane.showMessageDialog(null, "Employee " + fullname + " worked " + hoursWorked + " hours, and their gross pay is : $" + grossPay);
		
	}
}
