// Unit 5 - Exercise 19

import java.util.Scanner;

public class ValidateTriangle
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter the value of one of the sides of the triangle: " );
		double side1 = input.nextDouble();
		System.out.println( "Please enter the value of one of the other sides of the triangle: " );
		double side2 = input.nextDouble();
		System.out.println( "Please enter the value of one of the other sides of the triangle: " );
		double side3 = input.nextDouble();
		
		boolean isTriangleValid = IsValid( side1 , side2 , side3 );
		
		if( isTriangleValid )
		{
			double areaOfTheTriangle = ComputeArea( side1 , side2 , side3 );
			System.out.printf( "Area of the triangle is %.2f" , areaOfTheTriangle );
		}
		else
			System.out.println( "Input is invalid." );
	}
	
	public static boolean IsValid( double side1 , double side2 , double side3 )
	{
		if( ( side1 + side2 > side3 ) &&
			( side1 + side3 > side2 ) &&
			( side2 + side3 > side1 ) )
				return true;
				
		return false;
	}
	
	public static double ComputeArea( double side1 , double side2 , double side3 )
	{
		double halfOfCircumreference = ( side1 + side2 + side3 ) / 2;
		double areaOfTriangle = Math.pow ( halfOfCircumreference * ( halfOfCircumreference - side1 ) *
								( halfOfCircumreference - side2 ) * ( halfOfCircumreference - side3 ) , 0.5 );
		
		return areaOfTriangle;
	}
}
