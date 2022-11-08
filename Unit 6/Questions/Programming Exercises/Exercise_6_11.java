// Unit 6 - Exercise 11

import java.util.Scanner;

public class Exercise_6_11 // ComputeStandartDeviation
{
	public static void main( String[] args )
	{
		final int Array_Size = 10;
		double[] number_array = new double[ Array_Size ];
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter ten numbers:" );
		for( int i = 0 ; i < number_array.length ; i++ )
			number_array[ i ] = input.nextDouble();
	
		double mean = FindMean( number_array );
		double standartDeviation = FindDeviation( number_array , mean );
	
		System.out.printf( "The mean is %.2f\nThe standart deviation is %.5f" , mean , standartDeviation );
	}
	
	public static double FindDeviation( double[] values , double mean )
	{
		double sumOfSubtract = 0;
		for( int i = 0 ; i < values.length ; i++ )
		{
			sumOfSubtract += Math.pow( ( values[ i ] - mean ) , 2 );
		}
		
		return Math.sqrt( sumOfSubtract / ( values.length - 1 ) );
	}
	
	public static double FindMean( double[] values )
	{
		double mean = 0;
		
		for( int i = 0 ; i < values.length ; i++)
			mean += values[ i ];
			
		mean /= values.length;
		
		return mean;
	}
	
}
