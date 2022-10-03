# Chapter 6 | Single-Dimensional Arrays

### 6.2.1 Declaring Array Variables

- Main usage -> elementType[] arrayRefVar;

- Alternative -> elementType arrayRefVar[];

### 6.2.2 Creating Arrays

Declaration of an array variables does not allocate any space in memory for the array. It creates only a storage location for the reference to an array.

If a variable does not contain a reference to an array, the value of the variable is **null**.

After an array variable is declared, you can create an array by using the **new** operator with the floowing syntax;

	arrayRefVar = **new** elementType[ arraySize ];

This statement does two things: it creates an array using **new elementType[ arraySize ]**; it assigns the reference of the newly created array to the variable **arrayRefVar**

It can be combined like this; 

    elementType arrayRefVar = **new** elementType[ arraySize ];


***

To assign values to the elements, use the syntax:

    arrayRefVar[ index ] = value;

***
#### Caution

When an array is created, its elements are assigned the default value of 0 for the numeric primitive data types, '\u0000' for char types, and false for boolean types.
    
***

#### Note
An array variable that appears to hold an array actually contains a reference to that array. **An array variable and an array are different** 
Long story short, that **arrayRefVar** is a variable that contains a reference to an array to an array of **arraySize** of **elementType** elements.

***

### 6.2.3 Array Size and Default Values

The size of an array cannot be changed after the array is created.

### 6.2.4 Array Indexed Variables

Array indices are 0 based; that is, they range from 0 to **arrayRefVar.length - 1**

Each element in the array is represented using the following syntax, known as an *indexed variable*:

    arrayRefVar[ index ];
    
***
#### Caution
Some languages use parentheses to reference an array element, as in **arrayRefVar( index )**.

### 6.2.5  Array Initializers

Shorthand notation, known as the *array initializer*

    elementType[] arrayRefVar = { value0 , value1 , ... , *valuek*};

    double[] myList = { 1.9 , 2.9 , 3.4 , 3.5 };
    
***

#### Caution
The **new** operator is not used in array-initalizer syntax. So, splitting *array initializer* would cause a syntax error;

    // This is wrong!
    double[] myList;
    myList = { 1.9 , 2.9 , 3.4 , 3.5 };
    
***

### 6.2.7 For-each Loops

    for( elementType element: arrayRefVar )
    {
        // Process the element
    }

***
#### Caution
Accessing an array out of bounds is an error that throws a runtime **ArrayIndexOutOfBoundsException**. To avoid, make sure use index maximum -> **arrayRefVar.length - 1**

If index starts 1, not 0. This is occur another mistake calling the *off-by-one* error. This is occur generally when someone use **<=** instead of **<**.

## 6.5 Copying Arrays

    list2 = list1;
    
This statement doesn't copy the contents of the array referenced by *list1* *list2*, but copy the reference value from *list1* to *list2*. After this statement, *list1* and *list2 reference to the same array.

There are three ways to copy arrays; 

- Use a loop to copy individidual elements one by one.
- Use the static **arraycopy** method in the **System** class.
- Use the **clone** method to copy arrays; this will be introduced in Chapter 14.

The syntax for **arraycopy** method is shown below:

	arraycopy( sourceArray , src_pos , targetArray , tar_pos ; length );
	System.arraycopy( sourceArray , 0 , targetArray , 0 , sourceArray.length );

The parameters **src_pos** and **tar_pos** indicate the starting positions in between two arrays. The number of elements copied from one to another indicated by **length**.

***
#### Caution

The **arraycopy** method does not allocate memory space for the target array. The target array must have already been created with its memory space allocated. After the copying takes place, **targetArray** and **sourceArray** have the same content but independent memory locations.
***

## 6.6 Passing Arrays to Methods

You can also pass arrays to methods;

    public static void printArray( int[] array )
    {
        //do something
    }
    printArray( new int[]{ 3 , 1 , 2 , 6 , 4 , 2} );

***
#### Note
The preceding statement creates an array using the following syntax:

    new elementType[]{ value0 , value1 ... };
    
There is no explicit reference variable for the array. Such array is called an ***anonymous array***.

***
#### Caution

Java uses *pass-by-value* to pass arguments to a method. There are important differences between passing the values of variables of primitive data types and passing arrays.

- For an argument of a primitive type, the **argument's value** is passed.
- For an argument of an array type, the value of the argument is a reference to an array; this reference value is passed to the method. Semantically, it can be best described as *pass-by-sharing*, the array in the method is the same as the array being passed. **So if you change the array in the method, you will see the change outside the method.**

*** 
#### Note

The JVM stores the array in an area of memory called the **heap**, which is used for dynamic memory allocation where blocks of memory are allocated and freed in an arbitrary order.

## 6.7 Returning an Array from a Method

You can pass arrays when invoking a method. A method may also return an array.

## 6.8 Variable-Length Argument Lists

You can pass a variable number of arguments of the same type to a method. The parameter in the method is declared as follows:

    typeName... parameterName
    public static void printMax( double... numbers )
    {
        // do something
    }

Only one variable-length parameter may be specified in a method, and this parameter must be the last parameter. Any regular parameters must precede it. 
Java creates an array and passes the arguments to it.

## 6.9 Searching Arrays

### 6.9.1  The Linear Search Approach

The linear search approach compares the key element **key** sequentially with each element in the array. It continues to do so until the key matches an element in the array or the array is exhausted without a match being found. If a mathch is made, the linear search returns the index of the lement in the array that matches the key. If no match is found, the search returns -1.

    for( int i = 0 ; i < list.length; i++ )
    {
        if( key == list[ i ] )
            return i;
    }
    return -1;

On average, the algorithm will have to compare half of the elements in an array before finding the key, if it exists. 

**Since the execution time of a linear search increases linearly as the number of array elements increases, linear search is inefficient for a large array.**

### 6.9.2 The Binary Search Approach

For binary search to work, the array must be ordered. Assume that the array is in ascending order. The binary search first compares the key with the element in the middle of the array. Consider the following three cases:

- If the key is less than the middle element, you need to continue to search for the key only in the first half of the array.
- If the key is equal to the middle element, the search ends with a match.
- If the key is greater than the middle element, you need to continue to search for the key only in the second half of the array.

Clearly, the binary search method eliminates half of the array after each comparison.
Therefore, in the worst case when using the binary search approach, you need log2 n+1 comparisons to find an element in the sorted array.

    public static int BinarySearch( int[] list , int key )
    {
        int low = 0;
        int high = list.length - 1;
        
        while( high >= low )
        {
            int mid = ( low + high ) / 2;
            if ( key < list[ mid ] )
                high = mid - 1;
            else if ( key == list[ mid ] )
                return mid;
            else
                low = mid + 1;
        }
        
        // Not found and would be inserted to maintain the order of the list.
        return -low - 1;
    }

***
#### Note

Linear search is useful for finding an element in a small array or an unsorted array, but it is inefficient for large arrays. Binary search is more fficient, but it requires that the array be presorted.

***

## 6.10 Sorting Arrays

### 6.10.1 Selection Sort

Selection sort finds the smallest number in the list and places it first. It then finds the smallest number remaining and places it next to first, and so on, until only a single number remains. 

### 6.10.2 Insertion Sort

The insertion-sort algorithm sorts a list of values by repeatedly inserting a new element into a sorted sublist until the whole list is sorted.

## 6.11 The Arrays Class

The **java.util.Arrays** class contains various static methods for sorting and searching arrays, comparing arrays, and filling array elements. These methods are overloaded for all primitive types.

#### Methods

- sort 
- binarySearch
- equals
- fill






