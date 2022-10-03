// Unit 5 - Exercise 16

public class FindNumberOfDaysInAYear
{
	public static void main( String[] args )
	{
		int days = 0;
		for( int year = 2000 ; year <= 2010 ; year++ )
		{
			days = GetNumberOfDaysInAYear( year );
			System.out.printf( "Year %d has %d days\n" , year , days );
		}
	}
	
	public static int GetNumberOfDaysInAYear( int year )
	{
		if( year % 4 == 0 )
			return 366;
		else
			return 365;
	}
}
