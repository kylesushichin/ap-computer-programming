import java.util.Scanner;

public class PalindromeTester
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
            

            while ( thing5.charAt(left) == thing5.charAt(right) && left < right)
            {
                left++;
                right--;
            }
            
            System.out.println();
            if (left < right)
            {
                System.out.println("That string is NOT a palindrome.");
            }
            else
            {
                System.out.println("That string IS a palindrome.");
            }
            
            System.out.println();
            System.out.print("Test another palindrome (y/n)?");
            another = scan.nextLine();
        }
    }
}