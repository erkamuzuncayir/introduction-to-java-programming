// Unit 8 - Listing 10

public class TestCircle3
{
	// Main method
	public static void main( String[] args ) 
	{
		// Create a Circle with radius 5.0
		Circle3 myCircle = new Circle3( 5.0 );
		System.out.printf( "The area of the circle of radius %.2f is %.2f.\n" ,
							myCircle.GetRadius() , myCircle.GetArea() );
		
		// Increase myCircle's radius by 10%
		myCircle.SetRadius( myCircle.GetRadius() * 1.1 );
		System.out.printf( "The area of the circle of radius %.2f is %.2f.\n" ,
							myCircle.GetRadius() , myCircle.GetArea() );
		
		System.out.printf( "The number of objects created is %d.\n" ,
							Circle3.GetNumberOfObjects() );						
	}
}
