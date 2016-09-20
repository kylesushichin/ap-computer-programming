import java.util.Scanner;
public class Distance_Conversion
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        int miles;
        double kilometers;
        
        System.out.print("Enter a amount of whole miles: ");
        miles = scan.nextInt();
        
        final double km = 1.60935;
        kilometers = miles * km;
        System.out.print(miles + " miles is = " + kilometers);
    }
}