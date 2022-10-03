// Unit 5 - Exercise 35

import java.util.Scanner;

public class CalculateAreaOfAPentagon
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter one side of a pentagon: " );
		double side = input.nextInt();
		
		double area = CalculateArea( side );
		
		System.out.printf( "Area of pentagon that one side of length %.2f is %.3f" , side , area ); 
	}
	
	public static double CalculateArea( double side )
	{
		double area = ( 5 * Math.pow( side , 2 ) ) / ( 4 * Math.tan( Math.toRadians( 36 ) ) );
		
		return area;
	}
}
