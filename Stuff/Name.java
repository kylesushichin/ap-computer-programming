import java.util.Scanner;
public class Name
{
    public static void main(String args[])
    {
        String name;
        int length;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        name = scan.nextLine();
        //how you do....caps
        length = name.length();
        
        System.out.println(name + "length: " + length);
    }
}