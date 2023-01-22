// Unit 8 - Listing 11

public class TestPassObject
{
	// Main method
	public static void main( String[] args ) 
	{
		// Create a Circle object with radius 1
		Circle3 myCircle = new Circle3( 1 );
		
		// Print areas for radius 1, 2, 3, 4, and 5.
		int n = 5;
		PrintAreas( myCircle, n );
		
		// See myCircle.radius and times
		System.out.printf( "Radius is %.2f.\nn is %d.\n",
							myCircle.GetRadius(), n );		
	}
	
	// Print a table of areas for radius
	public static void PrintAreas( Circle3 c, int times )
	{
		System.out.println( "Radius\t\tArea" );
		while( times >= 1 )
		{
			System.out.printf( "%.2f\t\t%.2f\n", c.GetRadius(), c.GetArea() );
			c.SetRadius( c.GetRadius() + 1 );
			times--;
		}
	}
}
