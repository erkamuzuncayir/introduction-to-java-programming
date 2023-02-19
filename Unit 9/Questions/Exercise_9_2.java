// Chapter 9 - Exercise 2 | CheckSubstrings

import java.util.*;

public class Exercise_9_2
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter first string: " );
		String firstString = input.nextLine();
		
		System.out.print( "Please enter second string: " );
		String secondString = input.nextLine();
	
		if( IsSubstring( firstString, secondString ) )
			System.out.println( "One of two is substring." );
		else
			System.out.println( "None of two is substring." );
	}
	
	public static boolean IsSubstring( String first, String second )
	{
		boolean isSecondSubstring = first.indexOf( second ) > -1 ? 
										true : false;
		boolean isFirstSubstring = second.indexOf( first ) > -1 ?
										true : false;
	
		if( isFirstSubstring || isSecondSubstring )
			return true;
		else
			return false;
	}
}