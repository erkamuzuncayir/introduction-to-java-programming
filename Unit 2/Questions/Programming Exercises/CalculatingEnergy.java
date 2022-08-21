// Unit 2 - Exercise 16

import java.util.Scanner;

public class CalculatingEnergy
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter water amount, initial and final temperature
		System.out.print( "Enter the amount of water in kilogram: " );
		Scanner scannerGetInputOne = new Scanner( System.in );
		var amountOfWater = scannerGetInputOne.nextDouble();
		
		System.out.print( "Enter the initial temperature: " );
		Scanner scannerGetInputTwo = new Scanner( System.in );
		var initialTemperature = scannerGetInputTwo.nextDouble();
		
		System.out.print( "Enter the final temperature: " );
		Scanner scannerGetInputThree = new Scanner( System.in );
		var finalTemperature = scannerGetInputThree.nextDouble();
		
		// Calculate needed energy
		final int Multiplier = 4184;
		var neededEnergy = amountOfWater * ( finalTemperature - initialTemperature ) * Multiplier;
		
		// Display result
		System.out.println( "The energy needed is: " + neededEnergy );
	}
}