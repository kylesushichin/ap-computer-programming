import java.util.Scanner;
import java.util.Random;

public class HiLo
{
    public void thingsgobadly()
    {
        Random gen = new Random();
        Scanner scan = new Scanner(System.in);
        LoopAgain again = new LoopAgain();
        
        int num1 = gen.nextInt(100)+1; 
        int guess = 1;
        String answer = "yes";
       
        System.out.println(num1);
       
        again.getagain(num1);
        
        /*if ( guess == num1 )
        {
            System.out.println("Would you like to play again?");
            answer = scan.next();
            while ( answer.equalsIgnoreCase("yes"))
            {
                again.getagain(num1);
            }
        }
        else if ( guess == 0 )
        {
            System.out.println("Would you like to play again?");
            answer = scan.next();
            while ( answer.equalsIgnoreCase("yes"))
            {
                again.getagain(num1);
            }
        }*/
        
        /*while ( guess != 0 )
        {
            while ( guess != num1 && num1 != 0 )
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
        }*/
    }
}