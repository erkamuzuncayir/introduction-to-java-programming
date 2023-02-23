// Chapter 9 - Exercise 23 | MyString1

public class Exercise_9_23
{
	public static void main( String[] args )
	{
    char[] chars = { 'H', 'i', ' ', 'I', '\'', 'm', ' ', 't', 'e', 's', 't', '.' };
    char[] chars_two = { 'H', 'i', ' ', 'I', '\'', 'm', ' ', 't', 'e', 's', 't', '.' };
    
    MyString1 s = new MyString1( chars );
    MyString1 sTwo = new MyString1( chars_two );
    
    // charAt
    System.out.println( s.charAt( 3 ) );
    System.out.println( s.length() );
    
    // substring
    MyString1 sub = s.substring( 6, 10 );
    for( int i = 0; i < sub.length(); i++ )
      System.out.print( sub.charAt( i ) );
    
    System.out.println();
    
    // equals
    System.out.println( s.equals( sTwo ) );

    // toLowerCase
    s.toLowerCase();
    for( int i = 0; i < s.length(); i++ )
      System.out.print(s.charAt( i ) );
    
    System.out.println();

    // value of
    MyString1 valueOfInteger = MyString1.valueOf( 234 );
    for( int i = 0; i < valueOfInteger.length(); i++ )
      System.out.print( valueOfInteger.charAt( i ) );
    
    System.out.println();    
  
  }
}
