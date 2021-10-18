// Method Overloading program demonstration.

import java.util.*;

class Theatre
{
    String name;
    int screen_no,persons;
    void movieshow(String name,int screen_no,int persons)
    {
        System.out.println("Movie Title:"+name);
        System.out.println("Screen number:"+screen_no);
        System.out.println("Persons count:"+persons);
    }
    void movieshow(String title,int screen_num,int count,String type) // method overloading with different parameters.
    {
        System.out.println("\nMovie Title:"+title);
        System.out.println("Screen number:"+screen_num);
        System.out.println("Persons count:"+count);
        System.out.println("Animation Type:"+type);
    }
    
}

public class Main
{
	public static void main(String[] args) 
	{
		Theatre ob=new Theatre();
		ob.movieshow("Now you see me",1,250);
		ob.movieshow("The Jungle Book",2,200,"2D");
		
	}
}

/* 
Output:

Movie Title:Now you see me
Screen number:1
Persons count:250

Movie Title:The Jungle Book
Screen number:2
Persons count:200
Animation Type:2D

*/
