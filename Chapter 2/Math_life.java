import java.util.Scanner;
public class Math_life
{
    public static void main(String args[])
    {
        System.out.println("Enter 2 numbers of any kind!");
        
        float num1;
        float num2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Num1 = ");
        num1 = scan.nextFloat();
        System.out.print("Num2 = ");
        num2 = scan.nextFloat();
        
        System.out.println("\nThe sum = "+ (num1+num2));
        System.out.println("The product = "+ (num1*num2));
        System.out.println("The difference = "+ (num1-num2));
        
    }
}