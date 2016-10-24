import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        
        int pNum = 0;
        int num1 = 0;
        int number = 0;
        
        boolean win = false;
        boolean tie = true;
        while (num1==pNum)
        {
                if (number>0)
                {
                    System.out.println("It was a tie! Pick again.");
                }
            num1 = gen.nextInt(3)+1;
            
            System.out.println("Rock, paper, or scissors?\n1>Rock, \n2=Paper \n3>Scissors");
            System.out.println();
            pNum= scan.nextInt();
            
            
            number++;
            if (num1!=pNum)
                tie = false;
                
        }
        int rock = 1;
        int paper =2;
        int scissors = 3;
        
        
        if (num1 == 1)
            if(pNum == 3)
                win = false;
            else
                win = true;
                
        if (num1 == 2)
            if(pNum == 1)
                win = false;
            else
                win = true;
                
        if (num1 == 3)
            if(pNum == 2)
                win = false;
            else
                win = true;
                
        if (win = true)
            System.out.println("You WIN!");
        if(win = false)
            System.out.println("You LOOSE!!!!");
    }
}