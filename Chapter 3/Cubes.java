import java.util.*;
public class Cubes 
{
	public static void main (String[]args)
	{
		int a;
		int b;
		int a3;
		int b3;
		int c;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter two integers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		a3 = (int) Math.pow(a, 3);
		b3 = (int) Math.pow(b, 3);
		
		System.out.println("The sum of the cubes of " + a + " and " + b + " is: " + (a3 + b3));
	}
}
