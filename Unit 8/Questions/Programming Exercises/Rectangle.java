/* Unit 8 - Exercise 1

|---------------------------------------------------|
|	Rectangle										|
|---------------------------------------------------|
| width: double										|
| height: double									|
|---------------------------------------------------|
| Rectangle()										|
| Rectangle( newWidth: double, newHeight: double)	|
| GetArea(): double									|
| GetPerimeter(): double 							|
|---------------------------------------------------|
*/

public class Rectangle
{
	public static void main(String[] args) 
	{
		Rectangle firstRectangle = new Rectangle( 4, 40 );
		System.out.printf( "First Rectangle width is %.2f, height is %.2f, area is %.2f, perimeter is %.2f.\n", 
		firstRectangle.width, firstRectangle.height, 
		firstRectangle.GetArea(), firstRectangle.GetPerimeter() );
		
		
		Rectangle secondRectangle = new Rectangle( 3.5, 35.9 );		
	
		System.out.printf( "Second Rectangle width is %.2f, height is %.2f, area is %.2f, perimeter is %.2f.\n", 
		secondRectangle.width, secondRectangle.height, 
		secondRectangle.GetArea(), secondRectangle.GetPerimeter() );
		
	}
	
	double width;
	double height; 
	
	// Constructor without an argument
	Rectangle()
	{
		width = 1.0;
		height = 1.0; 
	}
	
	// Constructor with two argument
	Rectangle( double newWidth, double newHeight )
	{
		width = newWidth;
		height = newHeight;
	}
	
	double GetArea()
	{
		return width * height;
	}
	
	double GetPerimeter()
	{
		return ( width + height ) * 2;
	}
}
