// Unit 5 - Exercise 21

import java.util.Scanner;
public class ComputeMeanAndStandartDeviation
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int countOfNumber = 0;
		double sumOfNumber = 0;
		double sumOfPow = 0;
		
		for( int i = 0 ; i < 10 ; i++ )
		{
			System.out.println( "Please enter a number: " );
			double number = input.nextDouble();
			sumOfNumber += number;
			sumOfPow += Math.pow( number , 2 ); // Takes and sums these numbers for formula of standart deviation
			countOfNumber ++;
		}
		
		double mean = ComputeMean( sumOfNumber , countOfNumber );
		
		double standartDeviation = ComputeStandartDeviation( sumOfPow , sumOfNumber , countOfNumber );
	
		System.out.printf( "The mean is %.2f\n" , mean );
		System.out.printf( "The standart deviation is %.5f" , standartDeviation );
	}
	
	public static double ComputeMean( double sumOfNumber , int countOfNumber )
	{
		double mean = sumOfNumber / countOfNumber;
		
		return mean; 
	}
	
	public static double ComputeStandartDeviation( double sumOfPow , double sumOfNumber , int countOfNumber )
	{
		double standartDeviation = Math.sqrt( ( sumOfPow - ( Math.pow( sumOfNumber , 2 ) / countOfNumber ) )
												/ ( countOfNumber - 1  ) );
		
		return standartDeviation;
	}
	
	
}
