// Unit 8 - Listing 8

public class TestCircle2
{
	// Main method
	public static void main( String[] args ) 
	{
		System.out.printf( "Before creating objects\nThe number of Circle objects is %d\n" , 
							Circle2.numberOfObjects );
		
		// Create c1
		Circle2 c1 = new Circle2();
		
		// Display c1 before c2 is created
		System.out.printf( "\nAfter creating c1\nc1: radius (%.2f) and number of Circle objects (%d)\n" ,
							c1.radius, c1.numberOfObjects );
		
		// Create c2
		Circle2 c2 = new Circle2( 5 );
		
		// Modify c1
		c1.radius = 9;
		
		// Display c1 and c2 AFTER c2 was created
		System.out.printf( "\nAfter creating c2 and modifying c1\n" + 
							"c1: radius (%.2f) and number of Circle objects (%d)\n" +
							"c2: radius (%.2f) and number of Circle objects (%d)\n" ,
							c1.radius, c1.numberOfObjects, c2.radius, c2.numberOfObjects );
							
	}
}
