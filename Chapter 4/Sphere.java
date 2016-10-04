public class Sphere 
{
	private double diam, volume, sArea;
	private final double PI = 3.141592653;
	
	// gets data for diameters from MultiSphere class
	//V = 4/3 PI r^3 or 1/6 PI d^3
	//SA = 4 PI r^2 or PI d^2

	public Sphere (double diamIn) 
	{
		diam = diamIn;
	}
	
	//returns diameter
	public double getDiameter ()
	{
		return diam;
	}
	
	//calculate volume
	public double calcVolume () 
	{
		volume = (PI*(Math.pow(diam, 3))/6);
		return volume;
	}
	
	//calculate surface area
	public double calcSurfaceArea () 
	{
		sArea = PI*Math.pow(diam, 2);
		return sArea;
	}

	//toString method
	public String toString() 
	{
		return "Sphere [diam=" + diam + ", volume=" + volume + ", sArea=" + sArea + ", PI=" + PI + "]";
	}
}
