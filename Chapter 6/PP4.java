import java.util.*;
public class PP4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an amount of times you want the 100 bottles of beer song to play.");
        int limit = scan.nextInt();
        for( int beer = 100; beer > 100-limit; beer--)
        {
            System.out.println(beer + " bottles of beer on the wall");
            System.out.println(beer + " bottles of beer");
            System.out.println("If one of those bottles happen to fall");
            System.out.println(beer-1 + " bottles of beer on the wall");
            System.out.println();
        }
    }
}