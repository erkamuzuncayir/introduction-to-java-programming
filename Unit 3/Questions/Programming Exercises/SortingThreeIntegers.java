// Unit 3 - Exercise 8

import java.util.Scanner;

public class SortingThreeIntegers
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner and variables
		Scanner input = new Scanner( System.in );
		int lowest, mid, highest, sameOne, sameTwo;
		
		// Prompts the user to enter three number
		System.out.print( "Enter three numbers for sort: " );
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		// Finds order of the numbers and prints them.
		if( ( num1 < num2 ) && ( num1 < num3 ) && ( num2 != num3 ) )
		{
			lowest = num1;
			if( num2 < num3)
			{
				mid = num2;
				highest = num3;
			}
			else
			{
				mid = num3;
				highest = num2;
			}
			System.out.printf( "%d < %d < %d" , lowest , mid , highest );
		}
		else if( ( num2 < num1 ) && ( num2 < num3 ) && ( num1 != num3 ) )
		{
			lowest = num2;
			if( num1 < num3)
			{
				mid = num1;
				highest = num3;
			}
			else
			{
				mid = num3;
				highest = num1;
			}
			System.out.printf( "%d < %d < %d" , lowest , mid , highest );
		}
		else if( ( num3 < num1 ) && ( num3 < num2 ) && ( num1 != num2 ) )
		{
			lowest = num3;
			if( num2 < num1)
			{
				mid = num2;
				highest = num1;
			}
			else
			{
				mid = num1;
				highest = num2;
			}
			System.out.printf( "%d < %d < %d" , lowest , mid , highest );
		}	
		else if ( ( num1 == num2 ) && ( num1 == num3 ) )
		{
			System.out.printf( "%d = %d = %d" , num1 , num2 , num3 ); // Parentheses uses for avoid confusion.
		}
		else if ( num1 == num2 )
		{
			sameOne = num1;
			sameTwo = num2;
			if( sameOne < num3 )
			{
				highest = num3;
				System.out.printf( "%d = %d < %d" , sameOne , sameTwo , highest );
			}
			else
			{
				lowest = num3; 
				System.out.printf( "%d < %d = %d" , lowest , sameOne , sameTwo );
			}
		}
		else if ( num2 == num3 )
		{
			sameOne = num2;
			sameTwo = num3;
			if( sameOne < num1 )
			{
				highest = num1;
				System.out.printf( "%d = %d < %d" , sameOne , sameTwo , highest );
			}
			else
			{
				lowest = num1; 
				System.out.printf( "%d < %d = %d" , lowest , sameOne , sameTwo );
			}
		}
		else if ( num1 == num3 )
		{
			sameOne = num1;
			sameTwo = num3;
			if( sameOne < num2 )
			{
				highest = num2;
				System.out.printf( "%d = %d < %d" , sameOne , sameTwo , highest );
			}
			else
			{
				lowest = num2; 
				System.out.printf( "%d < %d = %d" , lowest , sameOne , sameTwo );
			}
		}
	}
}