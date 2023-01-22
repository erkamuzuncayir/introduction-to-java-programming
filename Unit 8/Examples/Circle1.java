// Unit 8 - Listing 2

public class Circle1
{
	// Main method
	public static void main(String[] args) 
	{
		// Create a circle with radius 1.0
		Circle1 circle1 = new Circle1();
		System.out.printf( "The area of the circle of radius %.2f is %.2f\n" , 
							circle1.radius , circle1.GetArea() );
		
		// Create a circle with radius 25
		Circle1 circle2 = new Circle1( 25 );
		System.out.printf( "The area of the circle of radius %.2f is %.2f\n" , 
							circle2.radius , circle2.GetArea() );

		// Create a circle with radius 125
		Circle1 circle3 = new Circle1( 125 );
		System.out.printf( "The area of the circle of radius %.2f is %.2f\n" , 
							circle3.radius , circle3.GetArea() );
							
		// Modify circle radius
		circle2.radius = 100;
		System.out.printf( "The area of the circle of radius %.2f is %.2f\n" , 
							circle2.radius , circle2.GetArea() );
		
	}

	double radius;
	
	// Construct a circle with radius 1
	Circle1()
	{
		radius = 1.0;
	}
	
	// Construct a circle with a specified radius
	Circle1( double newRadius )
	{
		radius = newRadius;
	}
	
	// Return the area of this circle
	double GetArea()
	{
		return radius * radius * Math.PI;
	}
}
