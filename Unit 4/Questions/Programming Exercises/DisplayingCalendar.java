// Unit 4 - Exercise 29

import java.util.Scanner;

public class DisplayingCalendar
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		int count = 0;
		int dayCountOfTheMonth = 0;
		int nextMonthStartDay = 0;
		
		// Prompts user to enter the year and first day of the year
		System.out.print( "Please enter year and first day of the year (Enter 0 to 6 for days.): " );
		int year = input.nextInt();
		int day = input.nextInt();
		
		// Determines which month of the year
		for ( int i = 1 ; i <= 12 ; i++ )
		{
			if ( ( i == 2 ) && ( year % 4 != 0 ) )
				dayCountOfTheMonth = 28;
			else if ( ( i == 2 ) && ( year % 4 == 0 ) )
			{
				nextMonthStartDay += 1;
				dayCountOfTheMonth = 29;
			}
			else if ( ( i == 4 ) || ( i == 6 ) || 
						( i == 9 ) || ( i == 11 ) )
			{
				nextMonthStartDay += 2;
				dayCountOfTheMonth = 30;
			}
			else if ( i == 1 )
			{
				nextMonthStartDay += 2;
				dayCountOfTheMonth = 31;
			}
			else
			{
				nextMonthStartDay += 3;
				dayCountOfTheMonth = 31;
			}
				
			// Determines which day of the week
			day = day % 7;
			count = day;
			
			// Displays month
			switch ( i )
			{
				case 1: System.out.printf( "\t\tJanuary %d\n" , year );
					break;
				case 2: System.out.printf( "\t\tFebruary %d\n" , year );
					break;
				case 3: System.out.printf( "\t\tMarch %d\n" , year );
					break;
				case 4: System.out.printf( "\t\tApril %d\n" , year );
					break;
				case 5: System.out.printf( "\t\tMay %d\n" , year );
					break;
				case 6: System.out.printf( "\t\tJune %d\n" , year );
					break;
				case 7: System.out.printf( "\t\tJuly %d\n" , year );
					break;
				case 8: System.out.printf( "\t\tAugust %d\n" , year );
					break;
				case 9: System.out.printf( "\t\tSeptember %d\n" , year );
					break;
				case 10: System.out.printf( "\t\tOctober %d\n" , year );
					break;
				case 11: System.out.printf( "\t\tNovember %d\n" , year );
					break;
				case 12: System.out.printf( "\t\tDecember %d\n" , year );
					break;

			}
			
			// Displays days of the week
			System.out.println( "Sun\tMon\tTue\tWed\tThu\tFri\tSat" );
			
			// Displays table
			for ( int k = 1 ; k < day + 1 ; k++ )
			{
				System.out.print("\t");
			}
			
			for ( int j = 1 ; j <= dayCountOfTheMonth ; j++ )
			{
				System.out.print( j + "\t" );
				count++;
				if ( count > 6 )
				{
					System.out.println();
					count = 0;
				}				
			}
			
			// Sets next month's start day
			day = nextMonthStartDay;
			
			System.out.println("\n");
		}
	}
}
