// Unit 5 - Exercise 33

public class DisplayCurrentDateAndTime
{
	public static void main( String[] args )
	{
		long totalMilliseconds = System.currentTimeMillis();
		PrintCurrentDateAndTime( totalMilliseconds );
	}
	public static void PrintCurrentDateAndTime( long totalMilliseconds )
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
		
		// Obtain the total day
		long totalDay = totalHours / 24;
		
		// Obtain the total year
		long totalYear = totalDay / 365;
		
		// Calculate the current year
		int currentYear = ( int )totalYear + 1970; // Unix epoch time starts 1970 so, it adds 1970 for reaching this year.
		
		/* Finds year is leap or not
		It subtract 2 because 1970 is not a leap year and we start to 2 years before to correct result
		*/
		boolean isLeap = isLeapYear( totalYear - 2 ); 
		
		// Finds which day of the year today is 
		int dayOfTheYear = FindDayOfTheYear( totalDay , totalYear , isLeap );
		
		// Finds which month and which day of the month today is
		String monthAndMonthDay = FindCurrentMonthAndMonthDay( dayOfTheYear , isLeap );
		
		// Finds which day of the week today is 
		String dayOfTheWeek = FindDayOfTheWeek( totalDay );
		
		// Prints result
		System.out.printf( "Current date and time is %S %S, %d %d:%d:%d in GMT +0.\n" , dayOfTheWeek , monthAndMonthDay , 
							currentYear , currentHour , currentMinute , currentSecond );
	}
	
	public static boolean isLeapYear( long year )
	{
		if( year % 4 == 0 )
			return true;
		else
			return false;
	}
	
	public static int FindDayOfTheYear( long totalDay , long totalYear ,  boolean isLeap )
	{
		long dayOfTheYear = 0;
		long leapDaysOfAllYears = ( totalYear - 2 ) / 4;
		
		if( isLeap )
		{
			dayOfTheYear = totalDay % 365 + 1;
		}
		else
			dayOfTheYear = totalDay % 365;
		
		dayOfTheYear -= leapDaysOfAllYears;
		
		return ( int ) dayOfTheYear;
	}
	
	
	public static String FindDayOfTheWeek( long totalDay )
	{
		long day = ( totalDay + 4 ) % 7; // It adds 4 because 01/01/1970 is thursday.
		String dayOfTheWeek = "";
		
		switch( ( int ) day )
		{
			case 0: dayOfTheWeek = "Sunday";
			break;
			case 1: dayOfTheWeek = "Monday";
			break;
			case 2: dayOfTheWeek = "Tuesday";
			break;
			case 3: dayOfTheWeek = "Wednesday";
			break;
			case 4: dayOfTheWeek = "Thursday";
			break;
			case 5: dayOfTheWeek = "Friday";
			break;
			case 6: dayOfTheWeek = "Saturday";
			break;
		}
		
		return dayOfTheWeek;
	}
	
	public static String FindCurrentMonthAndMonthDay( long dayOfTheYear , boolean isLeap )
	{
		int count = 0;
		int dayCount = 0;
		int month = 1;
		int monthDay = 0;
		while( count < dayOfTheYear )
		{
			monthDay = FindDaysAccordingToMonth( month , isLeap );
			count ++;
			dayCount ++;
			if( dayCount == monthDay )
			{
				month ++;
				dayCount = 0;
			}	
		}
		
		String monthName = WhichMonth( month );
		String monthAndMonthDay = monthName + " " + dayCount;
		
		return monthAndMonthDay;
	}
	
	public static int FindDaysAccordingToMonth( int month , boolean isLeap )
	{
			if( month == 4 || month == 6 || month == 9 || month == 11 )
				return 30;
			else if( month == 2 & isLeap )
				return 29;
			else if( month == 2 & !isLeap )
				return 28;
			else
				return 31;
	}
	
	public static String WhichMonth( int number )
	{
		String monthName = "";
		switch( number )
		{
			case 1: monthName = "Jan";
				break;
			case 2: monthName = "Feb";
				break;
			case 3: monthName = "Mar";
				break;
			case 4: monthName = "Apr";
				break;
			case 5: monthName = "May";
				break;
			case 6: monthName = "Jun";
				break;
			case 7: monthName = "Jul";
				break;
			case 8: monthName = "Aug";
				break;
			case 9: monthName = "Sep";
				break;
			case 10: monthName = "Oct";
				break;
			case 11: monthName = "Nov";
				break;
			case 12: monthName = "Dec";
				break;
		}
		
		return monthName;
	}
}
