// Unit 3 - Exercise 11

import java.util.Scanner;

public class FindingNumberOfDays
{
	public static void main( String[] args ) 
	{
		// Creates a scanner and variables
		Scanner input = new Scanner( System.in );
		String monthName = "";
		int monthDay = 0;
		
		// Prompts the user to enter month and year
		System.out.print( "Enter a month and a year: " );
		int month = input.nextInt();
		int year = input.nextInt();
		
		// Finds number of day in a month
		switch ( month )
		{
			case 1: monthDay = 31;
					monthName = "January";
					break;
			case 2: monthDay = 29;
					monthName = "February";
					break;					
			case 3: monthDay = 31;
					monthName = "March";
					break;
			case 4: monthDay = 30;
					monthName = "April";
					break;
			case 5: monthDay = 31;
					monthName = "May";
					break;
			case 6: monthDay = 31;
					monthName = "June";
					break;
			case 7: monthDay = 30;
					monthName = "July";
					break;
			case 8: monthDay = 31;
					monthName = "August";
					break;
			case 9: monthDay = 30;
					monthName = "September";
					break;
			case 10: monthDay = 31;
					monthName = "October";
					break;
			case 11: monthDay = 30;
					monthName = "November";
					break;
			case 12: monthDay = 31;
					monthName = "December";
					break;
		}		
		
		// Displays result
		if ( ( year % 4 == 0 ) && month == 2 )
			System.out.printf("%s %d has %d days" , monthName , year , ( monthDay - 1 ) );
		else
			System.out.printf("%s %d has %d days" , monthName , year , monthDay );
	}
}