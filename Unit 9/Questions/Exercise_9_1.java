// Chapter 9 - Exercise 1 | CheckSSN

import java.util.*;

public class Exercise_9_1
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter social security number: " );
		String userSsn = input.nextLine();
		
		if( CheckSSN( userSsn ) )
			System.out.println( "Valid SSN" );
		else
			System.out.println( "Invalid SSN" );
			
	}

	public static boolean CheckSSN( String ssn )
	{
		if( ssn.length() != 11 )
			return false;

		for( int i = 0; i < ssn.length(); i++ )
		{
			if( ( i == 3 || i == 6 ) &&
					ssn.charAt( i ) != '-' )
				return false;
			
			else if( ( i != 3 && i != 6 ) &&
					!Character.isDigit( ssn.charAt( i ) ) )
				return false;
		}
		
		return true;
	}
}