import java.util.*;
import java.text.*;
public class MultiSphere 
{
//-------------------------------------------
// 3 spheres and their measurements
//-------------------------------------------
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		DecimalFormat fmt = new DecimalFormat("0.####");

		System.out.print("Please input the diameter of a sphere: ");
		double diameter1 = input.nextDouble();
		Sphere diam1 = new Sphere (diameter1);
		
		System.out.print("Please input the diameter of second a sphere: ");
		double diameter2 = input.nextDouble();
		Sphere diam2 = new Sphere (diameter2);
		
		System.out.print("Please input the diameter of a third sphere: ");
		double diameter3 = input.nextDouble();
		Sphere diam3 = new Sphere (diameter3);
		
		System.out.println();
		
		//System.out.print(diam1.calcVolume() + " " + diam1.calcSurfaceArea()); Checking the methods
		
		System.out.println("Diameter\tVolume\t\tSurface Area");
		System.out.println("--------\t------\t\t-------------");
	
		System.out.println(fmt.format(diam1.getDiameter()) + "\t\t" + fmt.format(diam1.calcVolume()) + "\t\t" + fmt.format(diam1.calcSurfaceArea()));
		
		System.out.println();
		
		System.out.println(fmt.format(diam2.getDiameter()) + "\t\t" + fmt.format(diam2.calcVolume()) + "\t\t" + fmt.format(diam2.calcSurfaceArea()));
		
		System.out.println();
		
		System.out.println(fmt.format(diam3.getDiameter()) + "\t\t" + fmt.format(diam3.calcVolume()) + "\t\t" + fmt.format(diam3.calcSurfaceArea()));
		
		System.out.println();
	
		System.out.println(diam1.toString());
		System.out.println(diam2.toString());
		System.out.println(diam3.toString());

	}
}