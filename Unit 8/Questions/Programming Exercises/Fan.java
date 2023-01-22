/* Unit 8 - Exercise 8

|---------------------------------------------------	|
|	Fan													|
|---------------------------------------------------	|
| SLOW: int = 1											|
| MEDIUM: int = 2										|
| FAST: int = 3											|
| -speed: int = SLOW									|
| -on: boolean = false									|
| -radius: double = 5									|
| -color: String = "blue"								|
|---------------------------------------------------	|
| Fan()													|
| GetSpeed(): int										|
| SetSpeed( newSpeed: int )								|
| GetOn(): boolean										|
| SetOn( newOn: boolean )								|
| GetRadius(): double									|
| SetRadius( newRadius: double )						|
| GetColor(): String									|
| SetColor( newColor: String )							|
| ToString(): String											|
|---------------------------------------------------	|
*/

public class Fan
{
	public static void main( String[] args )
	{
		Fan test1 = new Fan();
		test1.SetSpeed( 3 );
		test1.SetColor( "yellow" );
		test1.SetOn( true );
		
		Fan test2 = new Fan();
		test2.SetSpeed( 5 );
		test2.SetColor( "blue" );
		test2.SetOn( false );
		
		System.out.println( test1.ToString() );
		System.out.println( test2.ToString() );
		
	}
	
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	int speed = SLOW;
	boolean on = false;
	double radius = 5.0;
	String color = "blue";
	
	int GetSpeed()
	{
		return speed;
	}
	
	void SetSpeed( int newSpeed )
	{
		speed = newSpeed;
	}
	
	boolean GetOn()
	{
		return on;
	}
	
	void SetOn( boolean newOn )
	{
		on = newOn;
	}
	
	double GetRadius()
	{
		return radius;
	}
	
	void SetRadius( double newRadius )
	{
		radius = newRadius;
	}
	
	String GetColor()
	{
		return color;
	}
	
	void SetColor( String newColor )
	{
		color = newColor;
	}
	
	String ToString()
	{
		String output = "";
		
		if( on == true )
			output = "Speed of fan is " + speed + ", color of fan is " + color +
			", radius of fan is " + radius;
		else
			output = "Fan is off.";
		
		return output;
	}
}