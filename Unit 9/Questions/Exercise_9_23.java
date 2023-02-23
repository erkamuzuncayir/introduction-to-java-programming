// Chapter 9 - Exercise 23 | MyString1

public class MyString1
{	
<<<<<<< Updated upstream
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
=======

	char[] internedString;
	
	public MyString1( char[] chars )
	{
		internedString = new[ chars.length ];
		for( int i = 0; chars.length; i++ )
			internedString[ i ] = chars[ i ];
	}
	
	public char charAt( int index )
	{
		return internedString[ index ];
	}
	
	public int length()
	{
		return internedString.length;
	}
	
	public MyString1 substring( int begin, int end )
	{
		MyString1[] substring = new MyString1[ end - begin ];
		for( int i = begin; i < end ; i++ )
		{
			substring[ i ] = internedString[ i ];
		}
		
		return substring;
	}
	
	public MyString1 toLowerCase()
	{
		for( int i = 0; i < internedString.length; i++ )
			Character.toLowerCase( internedString[ i ] );
	}
	
	public boolean equals( MyString1 s )
	{
		for( int i = 0; i < MyString1.length; i++ )
		{
			if( internedString[ i ] != MyString1[ i ] )
				return false;
		}
		
		return true;
	}
	
	public static MyString1 valueOf( int i )
	{
		return 
>>>>>>> Stashed changes
	}
}