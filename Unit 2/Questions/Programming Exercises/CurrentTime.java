// Unit 2 - Exercise 24

import java.util.Scanner;

public class CurrentTime
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter GMT Time zone
		System.out.print( "Enter the time zone offset to GMT: " );
		Scanner scannerGetInput = new Scanner ( System.in );
		int GMT = scannerGetInput.nextInt();
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = ( int )( totalSeconds % 60 );
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24;
		
		// Change according to input
		currentHour = currentHour + GMT;
		
		// Display results
		System.out.println( "Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT" );
	}
}