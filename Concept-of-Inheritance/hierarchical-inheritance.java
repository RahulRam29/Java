import java.util.*;
class publication
{
    String title;
    float price;
    void get_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        title = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        price = sc.nextFloat();
    }
    void put_data()
    {
        System.out.println("Title of Book is "+title);
        System.out.println("Price of Book is "+price);
    }
}
class book extends publication
{
    int pagecount;
    
    public void get_data()
    {
        super.get_data();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the book page count: ");
        int pagecount = input.nextInt();
    }
    
    void put_data()
    {
        super.put_data();
        System.out.println("Pagecount of Book is "+pagecount);
    }
}
class tape extends publication
{
    float playtime;
    public void get_data()
    {
        super.get_data();
        Scanner tp = new Scanner(System.in);
        System.out.println("Enter tape's playing duration: ");
        float playtime = tp.nextFloat();
    }
    
    void put_data()
    {
        super.put_data();
        System.out.println("Tape's playing time is "+playtime);
    }
}
class main
{
    public static void main(String[] args)
    {
        book b = new book();
        tape t = new tape();
        Scanner p = new Scanner(System.in);
        //int i;
        char ch='y';
        do {
            //char ch='y';
            System.out.println("1. Book   2. Tape");
            System.out.println("Enter your choice");
            int i = p.nextInt();
            switch(i) {
                case 1:
                    b.get_data();
                    b.put_data();
                    break;
                case 2:
                    t.get_data();
                    t.put_data();
                    break;
                default:
                    break; 
            }
            System.out.println("Do you wish to continue? ");
            ch = p.next().charAt(0);
            } while(ch=='y');
            
        }
    }
