# Unit 9 - Strings

- You can also create a string from an array of characters. For example, the following statements create the string “Good Day”:
char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
String message = new String(charArray);


- 9.2.2 Immutable Strings and Interned Strings
    A String object is immutable; its contents cannot be changed.


- Since strings are immutable and are ubiquitous in programming, the JVM uses a unique instance for string literals with the same character sequence in order to improve efficiency and save memory. Such an instance is called interned.

- All strings modify methods are create a new string because string is immutable.

- 9.4 The StringBuilder/StringBuffer Class
    The StringBuilder/StringBuffer class is an alternative to the String class. In general, a StringBuilder/StringBuffer can be used wherever a string is used. StringBuilder/StringBuffer is more flexible than String. You can add, insert, or append new contents into a StringBuilder or a StringBuffer, whereas the value of a String object is fixed.

- Note
    The length of the string is always less than or equal to the capacity of the builder.
    The builder’s capacity is automatically increased if more characters are added to exceed its capacity. Internally, a string builder is an array of characters, so the builder’s capacity is the size of the array. If the builder’s capacity is exceeded, the array is replaced by a new array. The new array size is 2 * (the previous array size + 1).