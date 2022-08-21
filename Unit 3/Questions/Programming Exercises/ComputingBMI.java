// Unit 3 - Exercise 6

import java.util.Scanner;

public class ComputingBMI
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
        
		// Declares and initializes constants
        final double Kilograms_Per_Pound = 0.45359237;
        final double Meters_Per_Inch = 0.0254;

		// Prompts the user to enter weigth and height values
        System.out.print( "Enter weight in pounds: " );
        double pounds = input.nextDouble();
        System.out.print( "Enter feet: " );
        int feet = input.nextInt();
        System.out.print( "Enter inches: " );
        int inches = input.nextInt();

		// Calculates BMI
		int heightInInches = ( feet * 12 ) + inches ;
        double convertedWeight = pounds * Kilograms_Per_Pound;
        double convertedHeight = heightInInches * Meters_Per_Inch;
        double bmi = convertedWeight / ( convertedHeight * convertedHeight );

		// Displays BMI and result
        System.out.printf( "Your BMI is %.1f\n" , bmi );
		if ( bmi < 16 )
			System.out.println( "You are seriously underweight" );
		else if ( bmi < 18 )
			System.out.println( "You are underweight" );
		else if ( bmi < 24 )
			System.out.println( "You are normal weight" );	
		else if ( bmi < 29 )
			System.out.println( "You are overweight" );
		else if ( bmi < 35 )
			System.out.println( "You are seriously overweight" );
		else
			System.out.println( "You are gravely overweight" );	}
}