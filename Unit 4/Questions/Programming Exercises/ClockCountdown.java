// Unit 4 - Exercise 43

import java.util.Scanner;

public class ClockCountdown
{
	public static void main ( String[] args )
	{
		// Creates a Scanner 
		Scanner input = new Scanner ( System.in );
		
		// Prompts user to enter number of second
		System.out.print( "Please enter the number of second: " );
		int seconds = input.nextInt();
		long startTime = System.currentTimeMillis();
		
		// Countdowns seconds
		while ( seconds > 0 )
		{
			long elapsedTime = System.currentTimeMillis();
			if ( ( startTime + 1000 ) < elapsedTime )
			{
				seconds -= 1;
				if ( seconds > 0 )
					System.out.printf( "%d seconds remaining\n" , seconds );
				startTime = elapsedTime;
			}
		}
		
		System.out.println( "Stopped" );
	}
}
