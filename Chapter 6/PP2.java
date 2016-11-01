import java.util.*;
public class PP2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str;
        int thing = 0;
        
        System.out.println("Enter some statement to print out.");
        str = scan.nextLine();
        
        for ( int strlength = str.length(); thing < strlength; thing++) 
        {
            System.out.println(str.charAt(thing));
        }
    }
}