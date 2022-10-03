// Unit 5 - Exercise 36

import java.util.Scanner;

public class CalculateAreaOfARegularPolygon
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter polygon side count: " );
		int sideCount = input.nextInt();
		
		System.out.print( "Please enter one side of a pentagon: " );
		double side = input.nextInt();
		
		double area = CalculateArea( sideCount , side );
		
		System.out.printf( "Area of a polygon that has %d side and one side of length %.2f is, %.3f" , 
							sideCount , side , area ); 
	}
	
	public static double CalculateArea( int sideCount , double side )
	{
		double area = ( sideCount * Math.pow( side , 2 ) ) / ( 4 * Math.tan( Math.PI / sideCount ) );
		
		return area;
	}
}
