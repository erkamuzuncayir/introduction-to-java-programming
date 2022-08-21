// Unit 2 - Exercise 1

import java.util.Scanner;

public class CelsiusToFahrenheit
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter celsius
        System.out.print( "Enter a degree in Celsius: " );
		Scanner scannerGetInput = new Scanner( System.in );
        var celsius = scannerGetInput.nextDouble();

        // Convert celsius to fahrenheit
		double fahrenheit = ( 9.0 / 5.0 ) * celsius + 32;
		
		// Display result
        System.out.print( celsius + " Celsius is " + fahrenheit + " Fahrenheit" );	
	}
}