import java.util.Scanner;
public class LoopAgain
{
    private int guess;
    private String answer = "yes";
    private static Scanner scan = new Scanner(System.in);
    
    public void getagain(int num1)
    {
        while (answer.equalsIgnoreCase("yes"))
        {
            System.out.println("Guess a number from 1 - 100. \tEnter 0 to quit.");
            guess = scan.nextInt();
            
            while ( guess != 0 )
            {
                while ( guess != num1 && guess != 0 )
                {
                    if ( guess < num1 )
                    {
                        System.out.println("Guess is low, guess another number from 1-100. \tEnter 0 to quit.");
                        guess = scan.nextInt();
                    }
                    else if ( guess > num1 ) 
                    {
                        System.out.println("Guess is high, guess another number from 1-100. \tEnter 0 to quit.");
                        guess = scan.nextInt();
                    }
                }
            }
            if ( guess == num1 )
            {
                System.out.println("Would you like to play again?");
                answer = scan.next();
                
            }
            else if ( guess == 0 )
            {
                System.out.println("Would you like to play again?");
                answer = scan.next();
                
            }
        }
    }
}