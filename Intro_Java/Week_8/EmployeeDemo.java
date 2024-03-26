//Author: Ana Victoria Gomes Mantovani
//Date: 10/15/2022
//Purpose: Store employee data

public class EmployeeDemo {

	public static void main(String[] args) 
	{
		Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

		System.out.println("Employee #1:");
		System.out.println("Employee name:       " + employee1.getName());
		System.out.println("Employee ID number:  " + employee1.getIdNumber());
		System.out.println("Employee department: " + employee1.getDepartment());
		System.out.println("Employee position:   " + employee1.getPosition());
		System.out.println();
		
		System.out.println("Employee #2:");
		System.out.println("Employee name:       " + employee2.getName());
		System.out.println("Employee ID number:  " + employee2.getIdNumber());
		System.out.println("Employee department: " + employee2.getDepartment());
		System.out.println("Employee position:   " + employee2.getPosition());	
		System.out.println();
		
		System.out.println("Employee #3:");
		System.out.println("Employee name:       " + employee3.getName());
		System.out.println("Employee ID number:  " + employee3.getIdNumber());
		System.out.println("Employee department: " + employee3.getDepartment());
		System.out.println("Employee position:   " + employee3.getPosition());	
	}

}
