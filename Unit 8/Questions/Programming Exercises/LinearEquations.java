/* Unit 8 - Exercise 11

|---------------------------------------------------	|
|	LinearEquations										|
|---------------------------------------------------	|
| -a: double											|
| -b: double											|
| -c: double											|
| -d: double											|
| -e: double											|
| -f: double											|
| ---------------------------------------------------	|
| LinearEquations( double a, double b, double c, double d, double e, double f )|
| GetA(): double										|
| SetA( double: newA ) 									|
| GetB(): double										|
| SetB( double: newB )									|
| GetC(): double										|
| SetC( double: newC )									|
| GetD(): double										|
| SetD( double: newA ) 									|
| GetE(): double										|
| SetE( double: newB )									|
| GetF(): double										|
| SetF( double: newC )									|
| IsSolvable(): boolean									|
| GetX(): double										|
| GetY(): double										|
|---------------------------------------------------	|
*/

import java.util.Scanner;

public class LinearEquations
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter a, b, c, d, e and f for equation, respectively: " );
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
	
		LinearEquations test = new LinearEquations( a, b, c, d, e, f );
		boolean isSolvable = test.IsSolvable();
		
		if( isSolvable )
			System.out.printf( "Solutions of equation are %.2f and %.2f\n", 
								test.GetX(), test.GetY() );
		else
			System.out.println( "The equation has no solution." );
	}
	
		double a, b, c, d, e, f;
	
	LinearEquations( double newA, double newB, double newC, double newD, double newE, double newF )
	{
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
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
	
	double GetD()
	{
		return d;
	}
	
	void SetD( double newD )
	{
		d = newD;
	}
	
	double GetE()
	{
		return e;
	}
	
	void SetE( double newE )
	{
		e = newE;
	}

	double GetF()
	{
		return f;
	}
	
	void SetF( double newF )
	{
		f = newF;
	}
	
	boolean IsSolvable()
	{
		return ( a * d - b * c ) != 0 ? true: false;
	}
	
	double GetX()
	{
		return ( e * d - b * f ) / ( a * d - b * c );
	}
	
	double GetY()
	{
		return ( a * f - e * c ) / ( a * d - b * c );
	}
}