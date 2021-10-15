/*
Create a class called Book that contains instance variables like BKName, BKId and BKAuthor and a method BKDetails(), 
that accepts an object of type Book as parameter, modifies some data of that object and returns the modified object. 
Include a method named show to display the original and modified object.
*/

import java.util.*;
class Book
{
  String BKName,BKAuthor;
  int BKId;
  Book()
  {
    BKName="The Alchemist";
    BKAuthor="Paulo Coelho";
    BKId=1100;
  }
  void BKDetails(Book ob)
  { 
    ob.BKName="Think like a Monk";
    ob.BKAuthor="Jay Shetty";
    ob.BKId=1101;  
  }
  void show()
  {
    System.out.println("Book Name :"+BKName);
    System.out.println("Author of the Book :"+BKAuthor);
    System.out.println("Book Id :"+BKId);
  }
}
public class Main2
{
 public static void main(String args[])
 {
  Book ob=new Book();
  System.out.println("Original");
  ob.show();
  ob.BKDetails(ob);
  System.out.println("Modified");
  ob.show();
 }
}  
