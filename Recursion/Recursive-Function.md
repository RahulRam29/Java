## Recursive Function

In many of the programs you code, you write functions that **call** or **invoke** other functions.

```Java
 void Function1()
 {
   .
   .
   Function2();  // Another function is called.
 }
 
 ```
 **_What is the difference between a Non-Recursive Function and a Recursive Function ?_**
 
 |           Recursive Function              |          Non-Recursive Function              |
 |-------------------------------------------|----------------------------------------------|
 | 1. Function that calls itself.            | 1. Function invocation is done by the user.  |
 | 2. Terminated through base case, where    | 2. A return statement stops the execution    |
 |          there will be no function call.  |       of the function.                       |
 | 3. Code size is smaller.                  | 3. Code size is larger.                      |
 | 4. Time Complexity is very high.          | 4. Time Complexity is not high when          |
 |                                           |    compared to recursive function.           |
 
 ### Programs to demonstrate Recursion:
 
 ```Java
 1. Concept 
 void A()
 {
   A();
 }
 
 ```
 
 ## How Recursion works?
 
 ```Java
 
 import java.util.*;

 class Start
 {
  public void execute()
  {
    int answer=factorial(5);
    System.out.println(answer);
  }
  public int factorial(int a)
  {
    if(a==1)
      return 1;
    else
    {
       return a*factorial(a-1);
    }
  }
 }
 public class Main
 {
  public static void main(String args[])
  {
    Start ob=new Start();
    ob.execute();
  }
 }
 
 ```
 ### Output:
 > 120

### How this output comes ?

