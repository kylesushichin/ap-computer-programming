import java.util.Random;
import java.util.Scanner;

public class SlotMachine
{
    public static void main(String args[])
    {
        Random gen = new Random();
        Scanner scan = new Scanner(System.in);
        
        String answer = "y";
        int num1;
        int num2; 
        int num3;
        
        while ( answer.equalsIgnoreCase("y"))
        {
            System.out.println("Would you like to play the Slot machine? Enter (y/n)");
            answer = scan.next();
            
            if( answer.equalsIgnoreCase("y"))
            {
                num1 = gen.nextInt(10);
                num2 = gen.nextInt(10);
                num3 = gen.nextInt(10);
               System.out.println(num1 + "\t" + num2 + "\t" + num3);
               
                if( num1 == num2 && num1 == num3 && num2 == num3 )
                {
                    System.out.println("Congrats you hit the jackpot!");
                    System.out.println();
                }
                else if( num1 == num2 && num1 != num3 && num2 != num3 )
                {
                    System.out.println("Better Luck next time.");
                    System.out.println();
                }
                else if( num1 != num2 && num1 == num3 && num2 != num3 )
                {
                    System.out.println("Better Luck next time.");
                    System.out.println();
                }
                else if( num1 != num2 && num1 != num3 && num2 != num3 )
                {
                    System.out.println("Better Luck next time.");
                    System.out.println();
                }
                else if( num1 != num2 && num1 != num3 && num2 == num3 )
                {
                    System.out.println("Better Luck next time.");
                    System.out.println();
                }
            }
        }
    }
}