import java.util.Scanner;

public class PalindromeTesterModified
{
    public static void main(String args[])
    {
        String str, another = "y";
        String thing, thing2, thing3, thing4, thing5;
        int left, right;
        
        Scanner scan = new Scanner(System.in);
        
        while ( another.equalsIgnoreCase("y"))
        {
            System.out.println("Enter a potential palindrome: ");
            str = scan.nextLine();
            thing = str.toLowerCase().replaceAll(" ", "");
            thing2 = thing.replaceAll("!", "");
            thing3 = thing2.replaceAll("\\.", "");
            thing4 = thing3.replaceAll("\\,", "");
            thing5 = thing4.replaceAll("\\'", "");
            
            
            left = 0;
            right = thing5.length() - 1;
            
            PalindromeRecursion p = new PalindromeRecursion();
            System.out.println(p.recursion(left, right));
        }
        System.out.print("Test another palindrome (y/n)?");
        another = scan.nextLine();
    }
}