// Chapter 9 - Exercise 23 | MyString1

public class MyString1
{
	char[] interned_string;
	
	public MyString1( char[] chars )
	{
		interned_string = new char[ chars.length ];
		for( int i = 0; i < chars.length; i++ )
			interned_string[ i ] = chars[ i ];
	}
	
	public char charAt( int index )
	{
		return interned_string[ index ];
	}
	
	public int length()
	{
		return interned_string.length;
	}
	
	public MyString1 substring( int begin, int end )
	{
		char[] sub_s = new char[ end - begin ];
		for( int i = begin; i < end ; i++ )
			sub_s[ i - begin ] = interned_string[ i ];
		
		return new MyString1( sub_s );
	}
	
	public MyString1 toLowerCase()
	{
		for( int i = 0; i < interned_string.length; i++ )
			interned_string[ i ] = Character.toLowerCase( interned_string[ i ] );
			
    return new MyString1( interned_string );		
	}
	
	public boolean equals( MyString1 s )
	{
		for( int i = 0; i < s.length(); i++ )
		{
			if( interned_string[ i ] != s.charAt( i ) )
				return false;
		}
		
		return true;
	}
	
	public static MyString1 valueOf( int i )
	{
    // find digit count of i
    int digitCount = 0;
    int temp = i;
    while( temp > 1 )
    {
      temp /= 10;
      digitCount++;
    }
    
    int divider = ( int )Math.pow( 10, digitCount - 1 );

    char[] value_of_i = new char[ digitCount ];
    
    for( int j = 0; j < value_of_i.length  ; j++ )
    {
      value_of_i[ j ] = ( char )( ( i / divider ) + '0' );
      i %= divider;
      divider /= 10;
    }
    
    return new MyString1( value_of_i );
  }
}
