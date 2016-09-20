import java.util.Scanner;
public class MoneyCounter
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        final int QUARTERS;
        final int DIMES;
        final int NICKELS;
        final int PENNIES;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int money;
        
        System.out.println("Enter the following amounts");
        System.out.print("\n\nQuarters: ");
        QUARTERS = scan.nextInt();
        
        System.out.print("Dimes: ");
        DIMES = scan.nextInt();
        
        System.out.print("Nickels: ");
        NICKELS = scan.nextInt();
        
        System.out.print("Pennies: ");
        PENNIES = scan.nextInt();
        
        quarters = QUARTERS*25;
        dimes = DIMES*10;
        nickels = NICKELS*5;
        pennies = PENNIES;
        money = quarters + dimes + nickels + pennies;
        System.out.println("The total amount of money in coins is: " + money);
    }
}