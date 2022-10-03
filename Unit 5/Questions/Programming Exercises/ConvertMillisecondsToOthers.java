// Unit 5 - Exercise 25

public class ConvertMillisecondsToOthers
{
	public static void main( String[] args )
	{
		long totalMilliseconds = System.currentTimeMillis();
		ConvertMilliseconds( 5500 );
		ConvertMilliseconds( 100000 );
		ConvertMilliseconds( 555550000 );
	}
	public static void ConvertMilliseconds( long totalMilliseconds )
	{
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
	
		if( totalMinutes > 60 )
			System.out.printf( "%d:%d:%d\n" , totalHours , currentMinute , currentSecond );
		else if( totalSeconds > 60 )
			System.out.printf( "0:%d:%d\n" , currentMinute , currentSecond );
		else
			System.out.printf( "0:0:%d\n" , currentSecond );

	}
}
