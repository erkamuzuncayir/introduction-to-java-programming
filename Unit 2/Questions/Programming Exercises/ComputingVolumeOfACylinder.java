// Unit 2 - Exercise 2

import java.util.Scanner;

public class ComputingVolumeOfACylinder
{
	public static void main( String[] args ) 
	{
		// Prompt the user to enter radius and length
		System.out.print( "Enter the radius and length of a cylinder: " );
        Scanner scannerGetInput = new Scanner( System.in );
        var radius = scannerGetInput.nextDouble();
        var length = scannerGetInput.nextDouble();
		
		// Compute area and volume
		final double PI = 3.14159265359;
		double area = Math.pow( radius , 2 ) * PI;
        double volume = area * length;
        
		// Display area and volume
		System.out.println( "The area is: " + area );
        System.out.println( "The volume is: " + volume );
	}
}