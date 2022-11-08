// Unit 6 - Exercise 12

import java.util.Scanner;

public class Exercise_6_12 // ReverseArray
{
	public static void main( String[] args )
	{
		final int Array_Size = 10;
		double[] number_array = new double[ Array_Size ];
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter ten numbers:" );
		for( int i = 0 ; i < number_array.length ; i++ )
			number_array[ i ] = input.nextDouble();
	
		for( double value: number_array )
			System.out.println(value);	
		
		double[] reversedArray = ReverseArray( number_array );
	
		for( double number: reversedArray )
			System.out.println( number );
	}
	
	public static double[] ReverseArray( double[] values )
	{
		for( int i = 0 ; i < values.length / 2 ; i++ )
		{
			double temp = values[ i ];
			values[ i ] = values[ values.length - i - 1 ];
			values[ values.length - i - 1 ] = temp;
		}
		
		return values;	
	}
}
