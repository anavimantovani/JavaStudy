//Author: Ana Victoria Gomes Mantovani
//Date: 09/29/22
//Purpose: Debug and beautify the program

import javax.swing.JOptionPane;
public class Lab6Fix
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
	    String allString = "";
	    allString = "Employee Name: " + fullname + "/n";
	    allString = allString + "Hours worked: " + hoursWorked + "\n";
	    allString = allString + "Gross Pay: $" + grossPay + "\n";
	    JOptionPane.showInputDialog(null, allString, fullname + "'s" + " Gross Pay", JOptionPane.INFORMATION_MESSAGE);
	}
}