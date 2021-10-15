// Exception Handling using try-catch method.

import java.util.*;
class MainException
{
 static void addEmployee()
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Employee Id: ");
 int empId = sc.nextInt();
 System.out.println("Enter Employee Name: ");
 String empName = sc.next();
 System.out.println("Enter Employee Age: ");
 int age = sc.nextInt();
 
 try
 {
 if(age<18)
 throw new Exception("Invalid Age");
 else 
 System.out.println("Details entered are valid.");
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
 
 public static void main(String args[])
 {
 addEmployee(); 
 }
}

