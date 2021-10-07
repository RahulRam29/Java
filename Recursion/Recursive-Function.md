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
 
 **_Writing Recursive Function :_**
 
 Every Recursive functions, must atleast have these two cases:
 - **Recursive Case :** It is the general case of the problem that we are trying to solve using a recursive function.
 - **Base Case :** It is the case that causes the termination of the recursion. It is the case in which the solution is pre-known and can be used without any computation itself.

> **Remember :** Every recursive function can have one or more base cases but only one recursive case.
 
 ## Programs to demonstrate Recursion:
 
 ### Concept
 
 ```Java
 
 void A()
 {
   A();
 }
 
 ```
 
 ### Computing Recursion
 
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

### How this output came ?

![Ref](https://user-images.githubusercontent.com/76544476/136370646-93863e16-56dd-46f9-b7c4-4c6e7f2d851d.png)


### Calculation of Power

```Java
import java.util.*;

 class Start
 {
  public void execute()
  {
    int answer=power(2,5);
    System.out.println(answer);
  }
  public int power(int a,int b)
  {
    if(b==1)
      return a;
    else
    {
       return a*power(a, b-1);
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

> 32

### How this output came ?

![Screenshot (188)](https://user-images.githubusercontent.com/76544476/136372865-50a37cbf-60de-40d1-aec2-549c6d1c3b17.png)



### Computing GCD 

```Java
import java.util.*;

 class Start
 {
  public void execute()
  {
    int answer=gcd(6,4);
    System.out.println(answer);
  }
  public int gcd(int a,int b)
  {
    if(b==0)
      return a;
    else
    {
       return gcd(b, a%b);
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

>2

### How this output came ?

![Screenshot (190)](https://user-images.githubusercontent.com/76544476/136373114-e4393611-6e5d-4600-80a4-baf3c7c78673.png)






