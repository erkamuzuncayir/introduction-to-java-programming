// Chapter 9 - Exercise 3 | CheckPassword

import java.util.*;

public class Exercise_9_3
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter password: " );
		String password = input.nextLine();
		
		if( CheckPassword( password ) )
			System.out.println( "Valid Password" );
		else
			System.out.println( "Invalid Password" );
	}
	
	public static boolean CheckPassword( String password )
	{
		if( password.length() < 8 )
			return false;
		
		int digitCount = 0;
		
		for( int i = 0; i < password.length(); i++ )
		{
			if( !Character.isLetterOrDigit( password.charAt( i ) ) )
				return false;
			else if( Character.isDigit( password.charAt( i ) ) )
				digitCount++;
		}
		
		if( digitCount < 2 )
			return false;

		return true;
	}
}