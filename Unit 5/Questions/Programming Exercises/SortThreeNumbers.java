// Unit 5 - Exercise 5

import java.util.Scanner;

public class SortThreeNumbers
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter three number" );
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		SortAndDisplayNumbers( num1 , num2 , num3 );
	}
	
	public static void SortAndDisplayNumbers( double num1 , double num2 , double num3 )
	{
		double max = 0 , mid = 0 , min = 0;
		if( num1 > num2 )
		{
			if( num2 > num3 )
			{
				max = num1;
				mid = num2;
				min = num3;
			}
			else
			{
				max = num1;
				mid = num3;
				min = num2;
			}
		}
		else if( num2 > num1 )
		{
			if( num1 > num3 )
			{
				max = num2;
				mid = num1;
				min = num3;	
			}
			else
			{
				max = num2;
				mid = num3;
				min = num1;
			}
		}
		else if( num3 > num1 )
		{
			if( num1 > num2 )
			{
				max = num3;
				mid = num1;
				min = num2;
			}
			else
			{
				max = num3;
				mid = num2;
				min = num1;
			}
		}
		System.out.printf( "%f > %f > %f\n" , max , mid , min );
	}
}
