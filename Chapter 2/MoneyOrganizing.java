import java.util.Scanner;
public class MoneyOrganizing
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
         int TEN;
         int FIVE;
         int ONE;
         int QUARTERS;
         int DIMES;
         int NICKELS;
         int PENNIES;
        
         double MONEY;
        final int money;
        System.out.print("Enter a monetary value no higher than 100: ");
        MONEY = scan.nextDouble();
        
        money = (int) MONEY*10000;
        TEN = (int) money/10000;
        FIVE = (int) money%10000/5000;
        ONE = (int) money%10000%5000/100;
        QUARTERS = (int) money%10000%5000%100/10;
        
        System.out.println(money + " There are " + TEN + " tens " + FIVE + " fives " + ONE + " ones " + QUARTERS + " quarters ");
    }
}