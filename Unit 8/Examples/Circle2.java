// Unit 8 - Listing 7

public class Circle2
{
	// The radius of the circle
	double radius;
	
	// The number of objects created
	static int numberOfObjects = 0;
	
	// Construct a circle with radius 1
	Circle2()
	{
		radius = 1.0;
		numberOfObjects++;
	}
	
	// Construct a circle with a specified radius
	Circle2( double newRadius )
	{
		radius = newRadius;
		numberOfObjects++;
	}
	
	// Return numberOfObjects
	static int GetNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	// Return the area of this circle
	double GetArea()
	{
		return radius * radius * Math.PI;
	}
}
