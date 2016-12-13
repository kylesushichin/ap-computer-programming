import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n;
        int sum = 1;
        int counter = 1;
        
        System.out.print("Enter the factorial you want to find: ");
        n = scan.nextInt();
        if(n == 0)
        {
            System.out.println("The factorial for " + n + " ! = " + 1);
        }
        while (counter<=n && n!=0 && n>0)
        {
            n--;
            sum *= n - 1;
            if ( counter == n) 
            {
                    System.out.println("The factorial for " + n + " ! = " + sum);
            }
        }
        
        while (n<0 && n!=0 && !(n>0))
        {
            System.out.print("Enter a factorial zero or above: ");
            n = scan.nextInt();
            if(n == 0)
            {
                System.out.println("The factorial for " + n + " ! = " + 1);
            }
            while (counter<=n && n!=0 && n>0)
            {
                n--;
                sum *= counter - 1;
                if ( counter == n) 
                {
                    System.out.println("The factorial for " + n + " ! = " + sum);
                }
            }
        }
    }
}
