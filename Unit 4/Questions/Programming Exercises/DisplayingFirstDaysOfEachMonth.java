// Unit 4 - Exercise 28

import java.util.Scanner;

public class DisplayingFirstDaysOfEachMonth
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		// Prompts user to enter the year and first day of the year
		System.out.print( "Please enter year and first day of the year (Enter 0 to 6 for days.): " );
		int year = input.nextInt();
		int day = input.nextInt();
		
		// Determines which month of the year
		for ( int i = 1 ; i <= 12 ; i++ )
		{
			if ( ( i == 2 ) && ( year % 4 != 0 ) )
				{}
			else if ( ( i == 2 ) && ( year % 4 == 0 ) )
				day++;
			else if ( ( i == 4 ) || ( i == 6 ) || 
						( i == 9 ) || ( i == 11 ) )
				day += 2;
			else if ( i == 1 )
				{}
			else
				day += 3;
				
			// Determines which day of the week
			day = day % 7;
			
			// Displays month
			switch ( i )
			{
				case 1: System.out.printf( "January 1, %d is " , year );
					break;
				case 2: System.out.printf( "February 1, %d is " , year );
					break;
				case 3: System.out.printf( "March 1, %d is " , year );
					break;
				case 4: System.out.printf( "April 1, %d is " , year );
					break;
				case 5: System.out.printf( "May 1, %d is " , year );
					break;
				case 6: System.out.printf( "June 1, %d is " , year );
					break;
				case 7: System.out.printf( "July 1, %d is " , year );
					break;
				case 8: System.out.printf( "August 1, %d is " , year );
					break;
				case 9: System.out.printf( "September 1, %d is " , year );
					break;
				case 10: System.out.printf( "October 1, %d is " , year );
					break;
				case 11: System.out.printf( "November 1, %d is " , year );
					break;
				case 12: System.out.printf( "December 1, %d is " , year );
					break;

			}
			
			// Displays day
			switch ( day )
			{
				case 0:	System.out.print( "Sunday\n" );
					break;
				case 1:	System.out.print( "Monday\n" );
					break;
				case 2:	System.out.print( "Tuesday\n" );
					break;
				case 3:	System.out.print( "Wednesday\n" );
					break;
				case 4:	System.out.print( "Thursday\n" );
					break;
				case 5:	System.out.print( "Friday\n" );
					break;
				case 6:	System.out.print( "Saturday\n" );
					break;					
			}
		}
	}
}
