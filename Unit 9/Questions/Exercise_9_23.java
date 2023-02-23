// Chapter 9 - Exercise 23 | MyString1

public class MyString1
{	
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