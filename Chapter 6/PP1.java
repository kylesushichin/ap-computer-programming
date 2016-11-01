import java.util.*;

public class PP1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int num;
        int sum = 0;
        
        System.out.print("Enter a number above 2: ");
        num = scan.nextInt();
        
        
        while(num < 2)
        {
            System.out.println("Error, value is less than 0. Enter another number: ");
            num = scan.nextInt();
        }
        for (int counter = 2; counter <= num; counter+=2)
        {
            sum += counter;
        }
        System.out.println("The sum of the even integers between 2 and " + num + " is " + sum);
    }
}