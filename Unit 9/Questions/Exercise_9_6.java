// Chapter 9 - Exercise 6 | CountLetters

import java.util.*;

public class Exercise_9_6
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a String: " );
		String str = input.nextLine();	
		
		System.out.printf( "Number of letter in %s is %d\n",
							str, CountLetters( str ) );
	}
	
	public static int CountLetters( String str )
	{	
		return str.length();
	}
}