import java.util.Scanner;
public class Average
{
    public static void main(String args[])
    {
        System.out.println("Hello Friend, Enter 3 numbers and get the average!");
        
        double num1;
        double num2;
        double num3;
        
        Scanner scan = new Scanner(System.in);
        
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();
        
        System.out.println("The average is " + ((num1+num2+num3)/3));
    }
}