# Chapter 7 - Multidimensional Arrays

## Two-dimensional array basics
### Declaring variables of two-dimensional arrays and creating two-dimensional arrays
Here is the syntax for declaring a two-dimensional array:

`elementType[][] arrayRefVar;`

or 

`elementType arrayRefVar[][]; // Allowed, but not preferred`

### Caution
It is a common mistake to use `matrix[2 , 1]` to access the element at row 2 and column 1.

### Array initializer
`int[][] array = { { 1, 2, 3 } , { 4, 5, 6 } , { 7, 8, 9 } , { 10, 11, 12 } };`

equivalent to;

```
int[][] array = new int[4][3];
array[0][0] = 1; array[0][1] = 2; array[0][2] = 3;
array[1][0] = 4; array[1][1] = 5; array[1][2] = 6;
array[2][0] = 7; array[2][1] = 8; array[2][2] = 9;
array[3][0] = 10; array[3][1] = 11; array[3][2] = 12;
```

### Obtaining the lengths of two-dimensional arrays
A two-dimensional array is actually an array in which each element is a one-dimensional array. 

Therefore if we create an array like this; `arrayRefVar = new int[3][2];`, `arrayRefVar.length` is 3 and each of elements length are 2.

### Ragged arrays
Because each element is different one-dimensional array. Each element's length can be different. This kind of arrays calls as *ragged array*.

`int[][] triangleArray = { {1, 2, 3, 4, 5}, {2, 3, 4, 5}, {3, 4, 5}, {4, 5}, {5} };`

if you don't know initial values you can use like below too;

```
int[][] triangleArray = new int[ 5 ][ ];
triangleArray[ 0 ] = new int[ 5 ];
triangleArray[ 1 ] = new int[ 4 ];
triangleArray[ 2 ] = new int[ 3 ];
triangleArray[ 3 ] = new int[ 2 ];
triangleArray[ 4 ] = new int[ 1 ];
```

### Tip
You can store the input in a file, say FindNearestPoints.txt, and compile and run the program using the following command.

`java FindNearestPoints < FindNearestPoints.txt`

# Multidimensional Arrays
Occasionally, you will need to represent n-dimensional data structures. In Java, you can create n-dimensional arrays for any integer n.