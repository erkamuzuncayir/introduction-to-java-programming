/* Unit 8 - Exercise 10

|---------------------------------------------------	|
|	QuadraticEquations									|
|---------------------------------------------------	|
| -a: double											|
| -b: double											|
| -c: double											|
| ---------------------------------------------------	|
| QuadraticEquations( double a, double b, double c )	|
| GetA(): double										|
| SetA( double: newA ) 									|
| GetB(): double										|
| SetB( double: newB )									|
| GetC(): double										|
| SetC( double: newC )									|
| GetDiscriminant(): double								|
| GetRoot1(): double									|
| GetRoot2(): double									|
|---------------------------------------------------	|
*/

import java.util.Scanner;

public class QuadraticEquations
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter a, b and c for equation, respectively: " );
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquations test = new QuadraticEquations( a, b, c );
	
		double discriminant = test.GetDiscriminant();
		
		if( discriminant > 0 )
			System.out.printf( "Root 1 is %.2f, root2 is %.2f\n", test.GetRoot1(), test.GetRoot2() );
		else if( discriminant == 0 )
			System.out.printf( "Root is %.2f\n", test.GetRoot1() );
		else
			System.out.printf( "The equation has no roots.\n" );
	}
	
	double a, b, c;
	
	QuadraticEquations( double newA, double newB, double newC )
	{
		a = newA;
		b = newB;
		c = newC;
	}
	
	double GetA()
	{
		return a;
	}
	
	void SetA( double newA )
	{
		a = newA;
	}
	
	double GetB()
	{
		return b;
	}
	
	void SetB( double newB )
	{
		b = newB;
	}


	double GetC()
	{
		return c;
	}
	
	void SetC( double newC )
	{
		c = newC;
	}
	
	double GetDiscriminant()
	{
		return Math.pow( b, 2 ) - 4 * a * c;
	}
	
	double GetRoot1()
	{
		return ( -b + Math.pow( Math.pow( b, 2 ) - 4 * a * c, 0.5 ) ) / 2 * a;
	}
	
	double GetRoot2()
	{
		return ( -b - Math.pow( Math.pow( b, 2 ) - 4 * a * c, 0.5 ) ) / 2 * a;
	}
}