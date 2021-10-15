/* Implement a Java program to define a class called ‘Customer’ with Name, Number, City and state as instance variables. 
Include various types of constructors such as Default constructor, Parameterized constructor with two arguments, three arguments and four arguments.
Create objects to invoke various types of constructors and demonstrate polymorphism.
*/

import java.util.*;
class Customer
{
 String Name;
 String City;
 String State;
 int Number;
 Customer()
 {
   Name="";
   City="";
   State="";
   Number=0;
 }
 Customer(String nm,int num)
 {
   this.Name=nm;
   this.Number=num;
 }
 Customer(String nam,String cit,int n)
 {
   this.Name=nam;
   this.City=cit;
   this.Number=n;
 }
 Customer(String name,String city,String state,int number)
 {
   this.Name=name;
   this.City=city;
   this.Number=number;
   this.State=state;
 }
 void display()
 {
   System.out.println("Name :"+Name+" City :"+City+" State :"+State+" Number :"+Number);
 }
}
public class Main3
{
 public static void main(String args[])
 {
   String N;
   String C;
   String S;
   int Num;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Name,State,City,Number");
   N=sc.nextLine();
   C=sc.nextLine();
   S=sc.nextLine();
   Num=sc.nextInt();
   Customer c1=new Customer(N,Num);
   c1.display();
   Customer c2=new Customer(N,C,Num);
   c2.display();
   Customer c3=new Customer(N,C,S,Num);
   c3.display();
 }
}
