import java.util.*;
import java.text.DecimalFormat;

public class Sphere
{
	public static void main (String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.####");

		final double PI = Math.PI;
		double rad,v,a;
		
		System.out.print("Please enter the radius: ");
		rad = scan.nextDouble();
		
		v = ((4/3)*PI*(Math.pow(rad, 3)));
		a = (4 * PI * Math.pow(rad, 2));
		
		System.out.println("A sphere with the radius of " + rad + " units has a volume of " +
		decimal.format(v) + " cubed units and an area of " + decimal.format(a) + " square units.");
	}
}
