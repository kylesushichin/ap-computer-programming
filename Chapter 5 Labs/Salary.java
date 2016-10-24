/* PreLab Section 5.1 - 5.3
1.
    a)( if ( x > y && y > z ))
    b)( if ( x < 0 && y < 0 ))
    c)( if ( x > 0 && y > 0 ))
    d)( if ( x == y && x != z ))
2.
    if ( gpa < 3.5 )
    {
        System.out.println("Congratulations—you made the Dean’s List");
    }
    else
    {
        System.out.println( “Sorry you didn’t make the Dean’s List”);
    }
3.
*/
    // ************************************************************
    // Salary.java
    // Computes the raise and new salary for an employee
    // ************************************************************
    import java.util.Scanner;
    public class Salary
    {
        public static void main (String[] args)
        {
            double currentSalary; // current annual salary
            double rating; // performance rating
            double r = 0; // dollar amount of the raise
            Scanner scan = new Scanner(System.in);
            
            // Get the current salary and performance rating
            
            System.out.print ("Enter the current salary: ");
            currentSalary = scan.nextDouble();
            
            System.out.print ("Enter the performance rating (1,2 or 3) : ");
            rating = scan.nextDouble();
            
            // Compute the raise -- Use if ... else ...
            if ( rating == 1)
            {
                r = (currentSalary * .06);
            }
            else if ( rating == 2)
            {
                r = (currentSalary * .04);
            }
            else if ( rating == 3)
            {
                r = (currentSalary * .015);
            }
            
            // Print the results
            
            System.out.println ("Amount of your raise: $" + r);
            System.out.println ("Your new salary: $" + (currentSalary + r));
        }
    }