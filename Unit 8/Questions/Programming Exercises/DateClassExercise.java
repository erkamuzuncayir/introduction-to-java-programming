// Unit 8 - Exercise 3

import java.util.Date;

public class DateClassExercise
{
	public static void main(String[] args) 
	{
		Date test = new Date();
		
		test.setTime( 10000L );
		test.getTime();
		System.out.printf( "For 10000: %s\n" , test.toString() );
		
		test.setTime( 100000L );
		test.getTime();
		System.out.printf( "For 100000: %s\n" , test.toString() );
		
		test.setTime( 1000000L );
		test.getTime();
		System.out.printf( "For 1000000: %s\n" , test.toString() );
		
		test.setTime( 10000000L );
		test.getTime();
		System.out.printf( "For 10000000: %s\n" , test.toString() );
		
		test.setTime( 100000000L );
		test.getTime();
		System.out.printf( "For 100000000: %s\n" , test.toString() );
		
		test.setTime( 1000000000L );
		test.getTime();
		System.out.printf( "For 1000000000: %s\n" , test.toString() );
		
		test.setTime( 10000000000L );
		test.getTime();
		System.out.printf( "For 10000000000: %s\n" , test.toString() );
	
		test.setTime( 100000000000L );
		test.getTime();
		System.out.printf( "For 100000000000: %s\n" , test.toString() );	
	}
} 
