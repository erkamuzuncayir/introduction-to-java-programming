// Unit 8 - Exercise 12
// I can't solve this problem.

import java.util.Scanner;

public class Intersection
{
	public static void main ( String[] args )
	{
		double[][] points = GetPoints();
		
		double[] arguments = CreateArguments( points );
	
		LinearEquations test = new LinearEquations( arguments[ 0 ], arguments[ 1 ], arguments[ 2 ],
													 arguments[ 3 ], arguments[ 4 ], arguments[ 5 ] );
		boolean isSolvable = test.IsSolvable();
		
		if( isSolvable )
			System.out.printf( "Intersecting point of two lines are %.2f and %.2f\n", 
								test.GetX(), test.GetY() );
		else
			System.out.println( "The two lines are parallel." );
	}
	
	public static double[][] GetPoints()
	{
		Scanner input = new Scanner( System.in );
		double[][] points = new double[ 2 ][ 4 ];
		
		for( int i = 0 ; i < points.length; i++ )
		{
			System.out.printf( "Enter the endpoints of the %d. line segment: " , i + 1 );
			for( int j = 0; j < points[ 0 ].length; j++ )
				points[ i ][ j ] = input.nextDouble();
		}

		return points;
	}
	
	public static double[] CreateArguments( double[][] points )
	{
		double[] p = new double[ 6 ];
		
		p[0] = points[1][0] - points[1][1];
		p[1] = -1 * (points[0][0] - points[0][1]);
		p[2] = points[1][2] - points[1][3];
		p[3] = -1 * (points[0][2] - points[0][3]);
		p[4] = (points[1][0] - points[1][1]) * points[0][0] - 
					  (points[0][0] - points[0][1]) * points[1][0];
		p[5] = (points[1][2] - points[1][3]) * points[0][2] - 
					  (points[0][2] - points[0][3]) * points[1][2];
	
		return p;
	}
}

class LinearEquations
{
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