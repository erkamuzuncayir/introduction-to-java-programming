/* Unit 8 - Exercise 9

|---------------------------------------------------	|
|	RegularPolygon										|
|---------------------------------------------------	|
| -n: int = 3											|
| -side: double = 1										|
| -x: double = 0										|
| -y: double = 0										|
|---------------------------------------------------	|
| RegularPolygon()										|
| RegularPolygon( int: sideCount, double: lengthOfSide )|
| RegularPolygon( int: sideCount, double: lengthOfSide, double: xCoordinateOfCenter, double: yCoordinateOfCenter )													|
| GetSideCount(): int									|
| SetSideCount( newSideCount: int )						|
| GetLengthOfSide(): double								|
| SetLengthOfSide(): ( newLengthOfSide: double )		|
| GetXCoordinateOfCenter(): double						|
| SetXCoordinateOfCenter( newXCoordinate: double )		|
| GetYCoordinateOfCenter(): double						|
| SetYCoordinateOfCenter( newYCoordinate: double )		|
| GetPerimeter(): double								|
| GetArea(): double										|
|---------------------------------------------------	|
*/

public class RegularPolygon
{
	public static void main( String[] args )
	{
		RegularPolygon test1 = new RegularPolygon();
		RegularPolygon test2 = new RegularPolygon( 6, 4 );
		RegularPolygon test3 = new RegularPolygon( 10, 4, 5.6, 7.8 );
	
		System.out.printf( "Perimeter of test1 is %.2f and area of test1 is %.2f\n",
							test1.GetPerimeter(), test1.GetArea() );
		System.out.printf( "Perimeter of test2 is %.2f and area of test2 is %.2f\n",
							test2.GetPerimeter(), test2.GetArea() );
		System.out.printf( "Perimeter of test3 is %.2f and area of test3 is %.2f\n",
							test3.GetPerimeter(), test3.GetArea() );
	}
	
	int n = 3;
	double side = 1;
	double x = 0;
	double y = 0;
	
	RegularPolygon()
	{
	}
	
	RegularPolygon( int sideCount, double lengthOfSide )
	{
		n = sideCount;
		side = lengthOfSide; 
	}
	
	RegularPolygon( int sideCount, double lengthOfSide, double xCoordinate, double yCoordinate )
	{
		n = sideCount;
		side = lengthOfSide; 
		x = xCoordinate;
		y = yCoordinate;
	}
	
	int GetSideCount()
	{
		return n;
	}
	
	void SetSideCount( int newSideCount )
	{
		n = newSideCount;
	}
	
	double GetLengthOfSide()
	{
		return side;
	}
	
	void SetLengthOfSide( int newLengthOfSide )
	{
		side = newLengthOfSide;
	}
	
	double GetXCoordinateOfCenter()
	{
		return x;
	}
	
	void SetXCoordinateOfCenter( int newXCoordinate )
	{
		x = newXCoordinate;
	}
	
	double GetYCoordinateOfCenter()
	{
		return y;
	}
	
	void SetYCoordinateOfCenter( int newYCoordinate )
	{
		y = newYCoordinate;
	}
	
	double GetPerimeter()
	{
		return n * side;
	}
	
	double GetArea()
	{
		return (Math.pow( side, 2 ) * n ) / ( 4 * Math.tan( Math.toRadians( 180 / n ) ) );
	}
}
