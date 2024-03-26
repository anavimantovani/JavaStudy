//Author: Ana Victoria Gomes Mantovani
//Date: 10/15/2022
//Purpose: Store employee data

public class Employee 
{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public void setName(String empName)
	{ name = empName;}
	
	public void setIdNumber(int empIdNumber)
	{idNumber = empIdNumber;}
	
	public void setDepartment(String empDepartment)
	{department = empDepartment;}
	
	public void setPosition(String empPosition)
	{position = empPosition;}
	
	public String getName()
	{return name;}
	
	public int getIdNumber()
	{return idNumber;}
	
	public String getDepartment()
	{return department;}
	
	public String getPosition()
	{return position;}
	
	public Employee(String empName, int empIdNumber, String empDepartment, String empPosition)
	{
		name = empName;
		idNumber = empIdNumber;
		department = empDepartment;
		position = empPosition;
	}
	
	public Employee(String empName, int empIdNumber)
	{
		name = empName;
		idNumber = empIdNumber;
		department = "";
		position = "";
	}
	
	public Employee()
	{
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
}
