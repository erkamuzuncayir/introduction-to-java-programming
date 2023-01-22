// Unit 8 - Listing 8

public class Circle3
{
	// The radius of the circle
	private double radius;
	
	// The number of objects created
	private static int numberOfObjects = 0;
	
	// Construct a circle with radius 1
	public Circle3()
	{
		radius = 1.0;
		numberOfObjects++;
	}
	
	// Construct a circle with a specified radius
	public Circle3( double newRadius )
	{
		radius = newRadius;
		numberOfObjects++;
	}
	
	// Return radius
	public double GetRadius()
	{
		return radius;
	}
	
	// Set a new radius
	public void SetRadius( double newRadius )
	{
		radius = ( newRadius >= 0 ) ? newRadius : 0;
	}
	
	// Return numberOfObjects
	public static int GetNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	// Return the area of this circle
	public double GetArea()
	{
		return radius * radius * Math.PI;
	}
}
