// Unit 6 - Exercise 8

import java.util.Scanner;

public class Exercise_6_8 // MeanOfArray
{
	public static void main( String[] args )
	{
		final int Array_Size = 10;
		double[] input_array = new double[ Array_Size ];
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter ten double numbers:" );
		
		for( int i = 0 ; i < input_array.length ; i++ )
			input_array[ i ] = input.nextDouble();
	
		double averageOfArray = FindAverage( input_array );
		
		System.out.printf( "Average of array is %.2f \n" , averageOfArray );
	}
	
	public static int FindAverage( int[] values )
	{
		int average = 0;
		
		for( int i = 0 ; i < values.length ; i++)
			average += values[ i ];
			
		average /= values.length;
		
		return average;
	}
	
	public static double FindAverage( double[] values )
	{
		double average = 0;
		
		for( int i = 0 ; i < values.length ; i++)
			average += values[ i ];
			
		average /= values.length;
		
		return average;
	}
}
