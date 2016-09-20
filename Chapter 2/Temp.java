import java.util.Scanner;
public class Temp
{
    public static void main(String argsp[])
    {
        Scanner scan = new Scanner(System.in);
        
        double fah;
        double celsius;
        
        System.out.print("Enter a temperature in Fahrenheit: ");
        fah = scan.nextDouble();
        
        final int BASE = 32;
        final double CONVERSION_FACTOR = 5.0 / 9.0;
        celsius = ((fah-BASE)*CONVERSION_FACTOR);
        
        System.out.println("Fahrenheit : "+ fah);
        System.out.println("Celcius : "+ celsius);
    }
}