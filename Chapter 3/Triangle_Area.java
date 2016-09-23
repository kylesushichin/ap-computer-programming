import java.util.Scanner;
public class Triangle_Area
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;
        double s;
        double area;
        
        System.out.print("Enter a value for the sides of a triangle: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        s = .5 * (a+b+c);
        
        area = Math.sqrt(s * (s - a)*(s - b)*(s-c));
        
        System.out.println("The area: " + area);
    }
}