// Unit 8 - Listing 12

public class TotalArea
{
	public static void main( String[] args )
	{
		// Declare circle_array
		Circle3[] circle_array;
		
		// Create circle_array
		circle_array = CreateCircleArray();
		
		// Print circle_array and total areas of the circles
		PrintCircleArray( circle_array );
	}
	
	// Create an array of Circle objects
	public static Circle3[] CreateCircleArray()
	{
		Circle3[] circle_array = new Circle3[ 5 ];
		
		for( int i = 0; i < circle_array.length ; i++ )
			circle_array[ i ] = new Circle3( Math.random() * 100 );
		
		// Return circle array
		return circle_array;
	}
	
	// Print an array of circles and their total area
	public static void PrintCircleArray( Circle3[] circle_array )
	{
		System.out.printf( "%-30s%-15s\n", "Radius", "Area" );
		for( int i = 0; i < circle_array.length ; i++ )
			System.out.printf( "%-30f%-15f\n", 
								circle_array[ i ].GetRadius(), circle_array[ i ].GetArea() );

		System.out.println("-------------------------------------------");
		
		// Compute and display the result
		System.out.printf( "%-30s%-1f\n", "The total area of circles is", Sum( circle_array ) );
	}
	
	// Add circle areas
	public static double Sum( Circle3[] circle_array )
	{
		// Initialize sum
		double sum = 0;
		
		// Add areas to sum
		for( int i = 0; i < circle_array.length ; i++ )
			sum += circle_array[ i ].GetArea();

		return sum;
	}
		
}
