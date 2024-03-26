//Author: Ana Victoria Gomes Mantovani
//Date: 09/16/2022
//Purpose: Calculate the payroll of an employee

import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.println("Enter number of hours worked in a week: ");
		Double hoursWorked = input.nextDouble();
		
		System.out.println("Enter hourly pay rate: ");
		Double payRate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		Double federalTax = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate: ");
		Double stateTax = input.nextDouble();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Employee's name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: $" + payRate);
		
		Double grossPay = hoursWorked * payRate;
		System.out.println("Gross Pay: $" + grossPay);
		
		Double fedRatePerc = federalTax * 100;
		Double staRatePerc = stateTax * 100;
		Double calcFedWith = grossPay * federalTax;
		Double calcStateWith = grossPay * stateTax;
		Double totalReduction = calcFedWith + calcStateWith;
		
		System.out.println("Deductions:");
		System.out.println("   Federal Withholding (" + fedRatePerc + "%): $" + String.format("%.2f", calcFedWith));
		System.out.println("   State Withholding (" + staRatePerc + "%): $" + String.format("%.2f", calcStateWith));
		System.out.println("   Total Deduction: $" + String.format("%.2f", totalReduction));
		
		Double netPay = grossPay - totalReduction;
		System.out.println("Net Pay: $" + String.format("%.2f", netPay));
		
	}

}
