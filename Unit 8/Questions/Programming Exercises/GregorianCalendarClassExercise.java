// Unit 8 - Exercise 5

import java.util.GregorianCalendar;

public class GregorianCalendarClassExercise
{
	public static void main(String[] args) 
	{
		GregorianCalendar test = new GregorianCalendar();
		System.out.printf( "%s %s %s\n" , test.get( GregorianCalendar.YEAR ),
							test.get( GregorianCalendar.MONTH ), 
							test.get( GregorianCalendar.DAY_OF_MONTH ) );
		
		test.setTimeInMillis( 1234567898765L );
		System.out.printf( "%s %s %s\n" , test.get( GregorianCalendar.YEAR ),
							test.get( GregorianCalendar.MONTH ), 
							test.get( GregorianCalendar.DAY_OF_MONTH ) );
	}


}
