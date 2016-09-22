// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radii
// ************************************************************
import java.util.Scanner;
public class Circle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        final double PI = 3.14159;
        int radius1;
        int radius2;
        
        System.out.println("Enter a value for the radius: ");
        radius1 = scan.nextInt();
        double area = PI * radius1 * radius1;
        double circumference = 2 * PI * radius1;
        
        System.out.println("The circumference is " + circumference);
        
        radius2 = radius1*2;
        area = PI * radius2 * radius2;
        circumference = PI * radius2 * 2;
        
        System.out.println("The area of a circle with radius " + radius2 + " is " + area);
        System.out.println("The circumference is " + circumference);
    }
}