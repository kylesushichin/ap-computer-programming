import java.util.*;
public class Dist 
{
	public static void main (String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		double x1,y1,x2,y2,distance,a,b,c,d,e;
		System.out.print("Please enter your first point: ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		System.out.print("Please enter your second point: ");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		
		a = (x2 - x1);
		b = (y2 - y1);
		
		c = Math.pow(a, 2);
		d = Math.pow(b, 2);
		
		e = (c + d);
		
		distance = Math.sqrt(e);
		
		System.out.println("The distance between the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance);
	}
}
