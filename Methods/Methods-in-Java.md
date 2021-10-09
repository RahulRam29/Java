# Methods in Java

The method in java is a set of instructions or executable instructions that performs a specific task providing reusabilty of code. Using methods, we can easily modify,add, delete content of the code.

# Why Methods/Functions ?

- It allows us to cope up with complex problems.
- To hide details that are low level.
- Conceptual units of code can be created.
- To reuse and modify portions of a code.

# Method Definition/Syntax:

```Java

 [Access Specifier][Modifier] return-type method-name( parameter/argument list )
 {
   // Body of the method.
 }

```
![Screenshot (10)](https://user-images.githubusercontent.com/76544476/136663570-5f8f1932-db95-43f1-abb9-ceaa470bc075.png)

# How to call/invoke/access a method ?

A method is invoked by providing the method name along with parameter that is being sent enclosed with parenthesis.

#### Example:
```Java
int compute(int x,int y)
{

}
```
Then the method call statement may look like,
```Java
result = compute(4,5);
```

# Returning from a Method

A method ends when either it encounters a return statement or the statement that is present in the last of the method is executed. 

The **return** statement is helpful in 2 ways:
- Firstly, when a _return_ statement is encountered, an immediate exit from the method occurs and control statement passes to main's caller.
- Second use of _return_ statement is that it is used in returning a value to the calling code.


# Program to demonstrate how to use a method in a program:

```Java
import java.util.Scanner;  
class EvenOdd  
{  
 void Even_Odd(int n)  // Method
 {  
   if(n%2==0)   
   System.out.println(n+" is an even number.");   
   else   
   System.out.println(n+" is an odd number.");  
 }  
}  
public class Main
{
  public static void main (String args[])  
  {  
    EvenOdd ob=new EvenOdd();
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter the number: ");  
    int num=sc.nextInt();  
    ob.Even_Odd(num);  // Method Call
  }
}

```

### Output:

> Enter the number: 5  <br>
> 5 is an odd number.
