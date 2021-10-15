/*
Define a class called cricket that will describe the following information:
Player name
Team name
Batting average
Using cricket, declare an array player with 10 elements and write a program to read the information about
all the 10 players and print a team-wise list containing names of a players with their batting average.
Write a function to perform the following operation:
i) To print batting average by getting player name as input.
*/

import java.util.Scanner;
class cricket{
    String pname;
    String tname; 
    double bavg;
    void get_details(){ 
	Scanner sc = new Scanner(System.in);
        pname = sc.nextLine();
       	tname = sc.nextLine();
       	bavg = sc.nextDouble();
    	
    }void print_details(){ 
    	System.out.println(pname+"\t"+tname+"\t"+bavg);
    }void bat_avg(){
        Scanner scan=new Scanner(System.in);
    	String p1 = scan.nextLine();
        if(p1.equals(pname)){
        	System.out.println("Batting Average of "+p1+"is:"+bavg);
        }
    }
}
public class Main{
	public static void main(String []args){
		cricket player[] = new cricket[10];
		System.out.println("Enter details of 10 Players:");
		for(int i=0;i<player.length;i++)
		{
                  player[i]=new cricket();
		  System.out.println("Enter Player "+(i+1)+" Details(Name,Team,Score)"); 
		  player[i].get_details();
 		}
		System.out.println("Details of 10 Players:");
		for(int i=0;i<player.length;i++)
		{
		  player[i].print_details();
 		}
		System.out.println("Enter Player name:");
		for(int i=0;i<player.length;i++)
		{
		  player[i].bat_avg();
 		}
	}
}
