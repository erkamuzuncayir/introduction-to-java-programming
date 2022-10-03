# Chapter 5 - Methods

## Chapter Summary

1. We use methods for making programs **more modular and reusable**.

2. **The method header** specifies the *modifers, return value type, method name* and *parameters* of the method.

3. The **returnValueType** is the data type of the value the **method returns**. If the method does not return a value, the **returnValueType** is the keyword **void**.

4. The *parameter list* refers to the *type, order* and *number of parameters* of a method. **The method name** and the **parameter list** together constitute the **method signature**. **Parameters are optional**; that is, a method may contain no parameters.

5. A return statement can also be used in a **void** method for terminating the method and returning to the method's caller.

6. The arguments that are passed to a method should have the same **number, type** and **order** as the parameters in the method signature.

7. When a program calls a method, **program control** is transferred to the called method. A called method returns control to the caller when its return statement is executed or when its method-ending closing brace is reached.

8. A value-returning method can aslo be invoked as a **statement** in Java. In this case, the caller simply ignores the return value.

9. Each time a method is invoked, the system stores parameters and local variables in a space known as a ***stack***. When a method calls another method, the caller's stack space is kept intact, and new space is created to handle the new method call. When a method finishes its work and returns to its caller, its associated space is **released**.

10. A method can be **overloaded**. This means that two methods can have the same name, as long as their **method parameter lists differ but modifiers kept same**.

11. A variable declared in a method is called a **local variable**. The scope of a local variable starts from its declaration and continues to the end of the block that contains the variable. A local variable must be declared and initialized before it is used.

12. Method abstraction is achieved by **separating the use of a method from its implementation**. The details of the implementation are encapsulated in the method and hidden from the client who invokes the method. This is known as **information hiding or encapsulation**.

13. Method abstraction **modularizes programs in a neat, hierarchical manner**. Programs written as collections of concise methods are **easier to write, debug, maintain, and modify** than would otherwise be the case. This writing style also promotes method **reusability**.

14. When implementing a large program, use the top-down or bottom-up coding approach. Do not write the entire program at once. This approach seems to take more time for coding (because you are repeatedly compiling and running the program), but it actually saves time and makes debugging easier.

## 5.1 Introduction

**A method is a collection of statements grouped together to perform an operation.**

## 5.2 Defining a Method

#### Syntax

>***modifier returnValueType methodName (list of parameters) 
{
	method body
}*** 
	
#### Sample

>*public static int max (int num1, int num2)
{
	int result;....
}*

### Header

The method header specifies the *modifiers*, *return value type*, *method name* and *parameters* of the method.

#### Return Type

A method may return a value. The **returnValueType** is the data type of the value the method returns.

If a method returns a value, it is called a *value-returning method*, otherwise it is a *void method*.

#### Parameters

The variables defined in the method header are known as ***formal parameters*** or simply ***parameters***. When a method is invoked, you pass a value to the parameter. This value is referred to as an ***actual parameter*** or ***argument***.

The parameter list refers to the **type**, **order** and **number of the parameters** of a method.

Parameters are optional.

*** 

### Note

Some programming languages, methods are referred to as procedures and functions. A value-returning method = function, void method = procedure.

***

### Caution
In the method header, you need to declare a separate data type for each parameter.

***

### Note
We say *define a method* and *declare a variable*. We are making a subtle distinction here. A definition defines what the defined item is, but a declaration usually involves allocating memory to store data for the declared item.

Each time a method is invoked, the system stores parameters and variables in an area of memory known as a *stack*, which stores elements in last-in, first-out fashion.

***

## 5.3 Calling a Method

There are two ways to call a method, depending on whether the method returns a value or not.

If the method returns a value, a call to the method is simply;

> *int larger = max (3, 4);*

If the method returns void, a call to the method must be a statement. Example;

> System.out.println( "Welcome to Java!" );

***

### Note
A value-returning method can also be invoked as a statement. In this case, the caller simply ignores the return value.

***

### Caution
A **return** statement is required for a value-returning method.

***Don't use else if's with return. Always contain else.***

***

### 5.3.1 Call Stacks

Each time a method is invoked, the system stores parameters and variables in an area of memory known as a *stack*, which stores elements in last-in, first-out fashion.

### 5.4 **void** Method Example

***

A **return** statement is not needed for a **void** method, but it can be used for terminating the method and returning to method's caller. Simply;

>***return;***

***

## 5.5 Passing Parameters by Values

Arguments must be given in the same order as ther respective parameters in the method signature. This is known as *parameter order association.*

***

###Caution
>The arguments must match the parameters in *order, number* and *compatible type*, as defined in the method signature. Compatible type means that you can pass an argument to a parameter without explicit casting, such as passing an **int** value argument to a **double** value parameter.

***

When you invoke a method with a parameter, the value of the argument is passed to the parameter. This is referred to as *pass-by-value*. If the argument is a variable rather than a literal value, the value of the variable is passed to the parameter. **The variable is not affected, regardless of the changes made to the parameter inside the method.**


The parameter is a variable in the method with its own memory space. The variable is allocated when the method is invoked, and it disappears when the method is returned to its caller.

## 5.6 Modularizing Code

Methods can be used to reduce redundant code and enable code reuse. Methods can also be used to modularize code and improve the quality of the program.

- Encapsulating the code for obtaining the specific method;

1 - It isolates the problem for computing the specific method from the rest of the code in the main method. Thus, the logic becomes clear and the program is easier to read.

2 - Narrows the scope of debugging.

3 - The specific method now can be reused by other programs.

## 5.8 Overloading Methods

Method overloading is two methods have the same name but different parameter lists within once class.

***

### Note
Overloaded methods must have different parameter lists. You cannot overload methods based on different modifiers or return types.

***

### Note
***Ambiguous invocation*** is occur when there are two or more possible matches for an invocation of a method, but the compiler cannot determine the most specific match.

***

## 5.9 The Scope of Variables

The **scope of a variable** is the part of the program where the variable can be referenced. A variable defined inside a method is referred to as a local variable.

It is starts from its declaration and continues to the end of the block that contains the variable.

A local variable must be declared and assigned a value before it can be used.


## 5.10 The Math Class

It contains *trigonometric methods, exponent methods* and *service methods*. Besides methods, Math class provides Math.PI and Math.E.

***

### Note
Not all classes need a main method. The Math class and JOptionPane class do not have main methods. These classes contain methods for other classes to use.

***

## 5.12 Method Abstraction and Stepwise Refinement

The key to developing software is to apply the concept of abstraction. *Method abstraction* is achieved by separating the use of a method from its implementation. The client can use a method without knowing how it is implemented. This is known as information hiding or encapsulation.

The concept of method abstraction can be applied to the process of developing programs. When writing a large program, you can use the *divide-and-conquer* strategy, aka *stepwise refinement* to decompose it into subproblems. The subproblems can be further decomposed into smaller, more manageable problems.

### 5.12.1 Top-Down Design

Beginner programmers often start by trying to work out the solution to every detail. Although details are important in the final program, concern for detail in the early stages may block the problem-solving process.To make problem solving flow as smoothly as possible, you should begin by using method abstraction to isolate details from design and only later implements the details.

### 5.12.2 Top-Down or Bottom-Up Implementation

When it comes implementation;
You would need to decide which modules to implement as methods and which to combine in other methods.

You can use either a "top-down" or a "bottom-up approach. The top-down approach implements one method in the structure chart at a time from the top to the bottom. Stubs can be used for the methods waiting to be implemented. A *stub* is a simple but incomplete version of a method. The use of stubs enables you to quickly build the framework of the program.

***

The bottom-up approach implements one method in the structure chart at a time from the bottom to the top. The top-down and bottom-up approaches are both fine. Both approaches implement methods incrementally, help to isolate programming errors, and make debugging easy. Sometimes they can be used together.

## 5.13 Implementation Details


### Note
Method abstraction modularizes programs in a neat, hierarchical manner. Programs written as collections of concise methods are easier to write, debug, maintain and modify. This writing style also promotes method reusability.

***

### Tip
When implementing a large program, use the top-down or bottom-up approach. Do not write the entire program at once. Using these approaches seems to take more development time (because you repeatedly compile and run the program), but it actually saves time and makes debugging easier.

***
