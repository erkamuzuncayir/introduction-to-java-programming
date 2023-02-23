// Chapter 9 - Exercise 15 | FindCountOfUppercase

import java.util.*;

public class Exercise_9_15
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a string: " );
		String str = input.nextLine();
		
		System.out.printf( "Uppercase letter count is %d", FindCountOfUppercase( str ) ); 
	}
	
	public static int FindCountOfUppercase( String str )
	{
		int uppercaseCount = 0;
		for( int i = 0; i < str.length(); i++ )
		{
			if( Character.isUpperCase( str.charAt( i ) ) )
				uppercaseCount++;
		}
		
		return uppercaseCount;
	}
}