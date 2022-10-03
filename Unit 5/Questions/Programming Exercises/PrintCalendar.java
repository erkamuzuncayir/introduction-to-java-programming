// Unit 5 - Listing 12 

import java.util.Scanner;

public class PrintCalendar
{
	/** Main method */
	public static void main( String[] args ) 
	{
		Scanner input = new Scanner( System.in) ;
		
		// Prompt the user to enter year
		System.out.print( "Enter full year (e.g., 2001): " );
		int year = input.nextInt();
		
		// Prompt the user to enter month
		System.out.print( "Enter month in number between 1 and 12: " );
		int month = input.nextInt();
		
		// Print calendar for the month of the year
		PrintMonth( year, month );
	}
	
	/** Print the calendar for a month in a year */
	public static void PrintMonth( int year , int month ) 
	{
		// Print the headings of the calendar
		PrintMonthTitle( year , month );
		
		// Print the body of the calendar
		PrintMonthBody( year , month );
		
	}
	
	/** Print the month title, e.g., May, 1999 */
	public static void PrintMonthTitle( int year , int month ) 
	{
		System.out.println( "	" + GetMonthName(month) + " " + year );
		System.out.println( "———————————————————————————————" );
		System.out.println( " Sun Mon Tue Wed Thu Fri Sat" );
	}
	
	/** Get the English name for the month */
	public static String GetMonthName( int month ) 
	{
		String monthName = " ";

		switch  (month ) 
		{
			case 1: monthName = "January"; 
				break;
			case 2: monthName = "February"; 
				break;
			case 3: monthName = "March"; 
				break;
			case 4: monthName = "April"; 
				break;
			case 5: monthName = "May"; 
				break;
			case 6: monthName = "June"; 
				break;
			case 7: monthName = "July"; 
				break;
			case 8: monthName = "August"; 
				break;
			case 9: monthName = "September"; 
				break;
			case 10: monthName = "October"; 
				break;
			case 11: monthName = "November"; 
				break;
			case 12: monthName = "December";
		}
		
		return monthName;
	}
	
	// Print month body 
	public static void PrintMonthBody( int year , int month ) 
	{
		// Get start day of the week for the first date in the month
		int startDay = GetStartDay( year , month ) ;
		
		// Get number of days in the month
		int numberOfDaysInMonth = GetNumberOfDaysInMonth( year , month );
		
		// Pad space before the first day of the month
		int i = 0;
		for( i = 0 ; i < startDay ; i++ )
			System.out.print( "    " );
		
		for( i = 1 ; i <= numberOfDaysInMonth ; i++) 
		{
			System.out.printf( "%4d", i );
			
			if ( ( i + startDay ) % 7 == 0 )
				System.out.println();
		}
		
		System.out.println();
	}
	
	/** Get the start day of month/1/year */
	public static int GetStartDay( int year, int month ) 
	{
		final int Day = 1;
		int yearOfTheCentury = year % 100;
		int century = year / 100;
		
		// Fixes january and february input for the formula
		if ( month == 1 )
			month = 13;
		if ( month == 2 )
			month = 14 ;
		
		// Finds day of the week
		int numberOfDay = ( ( Day + ( ( 26 * ( month + 1 ) ) / 10 ) + yearOfTheCentury + 
						( yearOfTheCentury / 4 ) + ( century / 4 ) + ( 5 * century ) ) % 7 );
		
		return numberOfDay - 1; // -1 Because American style weekday count starts from zero not one.
	}
	
	/** Get the total number of days since January 1, 1800 */
	public static int GetTotalNumberOfDays( int year , int month ) 
	{
		int total = 0;
		
		// Get the total days from 1800 to 1/1/year
		for( int i = 1800 ; i < year ; i++ )
		{
			if ( isLeapYear( i ) )
				total = total + 366;
			else
				total = total + 365;
		}
		
		// Add days from Jan to the month prior to the calendar month
		for( int i = 1 ; i < month ; i++ )
		{
			total = total + GetNumberOfDaysInMonth(year, i);
		}
		return total;
	}

	/** Get the number of days in a month */
	public static int GetNumberOfDaysInMonth( int year , int month ) 
	{
		if( month == 1 || month == 3 || month == 5 || month == 7 ||
			month == 8 || month == 10 || month == 12 )
		{
			return 31;
		}
		
		if ( month == 4 || month == 6 || month == 9 || month == 11 )
		{
			return 30;
		}
			
		if ( month == 2 ) 
		{
			return isLeapYear( year ) ? 29 : 28;
		}
		
		return 0; // If month is incorrect
	}

	/** Determine if it is a leap year */
	public static boolean isLeapYear( int year ) 
	{
		return year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 );
	}
}
