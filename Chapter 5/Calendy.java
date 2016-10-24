import java.util.Scanner;
public class Calendy
{
    private static Scanner scan = new Scanner(System.in);
    private int year = 1;
    private int termination;
    
    public void dothing()
    {
        
        
        while ( year != 0 )
        {
            System.out.println("Enter a Year to See if it is a leap year! \tEnter 0 to terminate the program.");
            year = scan.nextInt();
            while ( year <= 1582 && year != 0 )
            {
                System.out.println("Error, Enter a year after 1582");
                year = scan.nextInt();
            }
            if( year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                    if ( year % 400 != 0)
                    {
                        System.out.println(year + " is not a leap year, enter a new year.");
                    
                    }
                    else
                    {
                        System.out.println(year + " is a leap year.");
                    }
                }
            }
        }
        if ( year == 0 )
        {
            System.out.println("GoodBye");
        }
    }
}