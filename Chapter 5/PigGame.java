import java.util.Scanner;
import java.util.Random;

public class PigGame
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        PairOfDice maybe = new PairOfDice();
        
        int counter1, counter2, counter3, counter4;
        int order;
        String piggame = "y";
        
        System.out.println("Would you like to play the Pig Game? (y/n)");
        piggame = scan.next();
        
        if ( piggame.equalsIgnoreCase("y"))
        {
            order = gen.nextint(2)+1;
            if ( order == 1)
            {
                System.out.println("You are going first.");
            }
            if ( order == 2)
            {
                System.out.println("You are going second.");
            }
        }
    }
}