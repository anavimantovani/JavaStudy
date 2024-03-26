//Author: Ana Victoria Gomes Mantovani
//Date: 10/15/2022
//Purpose: Display the number of days in a month

public class MonthDays 
{

	private int month;
	private int year;
	
	public void setMonth(int enterMonth)
	{ month = enterMonth;}
	
	public void setYear(int enterYear)
	{ year = enterYear;}
	
	public int getMonth()
	{return month;}
	
	public int getYear()
	{return year;}
	
	public int numberOfDays()
	{
		int days = 0;
		boolean isLeapYear = year%4 == 0 && (year%100 != 0 || year%400 == 0);
		
		if (month == 2)
		{
			if (isLeapYear)
			{
				days = 29;
			}
			else
			{
				days = 28;
			}
		}
		else
		{
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			{
				days = 31;
			}
			else
			{
				days = 30;
			}
			
		}
		
		return days;
	}
	
	public MonthDays(int enterMonth, int enterYear)
	{
		month = enterMonth;
		year = enterYear;
	}
}
