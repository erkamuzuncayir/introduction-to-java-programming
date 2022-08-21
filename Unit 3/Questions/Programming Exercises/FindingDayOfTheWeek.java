// Unit 3 - Exercise 21

import java.util.Scanner;

public class FindingDayOfTheWeek
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner and variable
		Scanner input = new Scanner( System.in );
		int numberOfDay;
		
		// Prompts the user to enter year, month and day of the month
		System.out.print( "Enter year: (e.g., 2008): " );
		int year = input.nextInt();
		System.out.print( "Enter month: 1-12: " );
		int month = input.nextInt();
		System.out.print( "Enter the day of the month: 1-31: " );
		int day = input.nextInt();
		int yearOfTheCentury = year % 100;
		int century = year / 100;
		
		// Fixes january and february input for the formula
		if ( month == 1 )
			month = 13;
		if ( month == 2 )
			month = 14 ;
		
		// Finds day of the week
		numberOfDay = ( ( day + ( ( 26 * ( month + 1 ) ) / 10 ) + yearOfTheCentury + 
						( yearOfTheCentury / 4 ) + ( century / 4 ) + ( 5 * century ) ) % 7 );
		
		// Displays result
		switch( numberOfDay )
		{
			case 1: System.out.println( "Day of the week is Sunday" );
				break;
			case 2: System.out.println( "Day of the week is Monday" );
				break;
			case 3: System.out.println( "Day of the week is Tuesday" );
				break;
			case 4: System.out.println( "Day of the week is Wednesday" );
				break;
			case 5: System.out.println( "Day of the week is Thursday" );
				break;
			case 6: System.out.println( "Day of the week is Friday" );
				break;
			case 7: System.out.println( "Day of the week is Saturday" );
				break;
		}
	}
}