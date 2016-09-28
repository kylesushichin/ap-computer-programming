import java.util.Random;
import java.util.Scanner;
public class Dice
{
    public static void main(String args[])
    {
        Random gen = new Random(); 
        Scanner scan = new Scanner(System.in);
        String answer1;
        
        int num1;
        int num2;
        int sum;
        
        num1 = gen.nextInt(6)+1;
        num2 = gen.nextInt(6)+1;
        sum = num1 + num2;
        
        System.out.print("The first die rolled is: " + num1 + " The second die rolled is: " + num2 + " The total rolled is: " + sum);
        System.out.print("\nRoll again? ");
        answer1 = scan.next();
        
        if(answer1.equals("yes") || answer1.equals("Yes"))
        {
            System.out.println();
            num1 = gen.nextInt(6)+1;
            num2 = gen.nextInt(6)+1;
            sum = num1 + num2;
            
            System.out.print("The first die rolled is: " + num1 + " The second die rolled is: " + num2 + " The total rolled is: " + sum);
        }
        else
        {
            return;
        }
    }
}