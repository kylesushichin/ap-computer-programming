public class Box 
{
	private double boxW, boxH, boxL;
	private boolean full;
	
	public Box(double width, double height, double length, boolean fullBox) 
	{
		full = false;
		boxW = width;
		boxH = height;
		boxL = length;
	}
	public void setFull(boolean fullBox) 
	{
		full = fullBox;
	}
	public String getFull() 
	{
		if(full = true){
			return "Yes";
		}else{
			return "No";
		}
	}
	public double getWidth() 
	{
		return boxW;
	}
	public double getHeight()
	{
		return boxH;
	}
	public double getLength()
	{
		return boxL;
	}
	
	public String toString() 
	{
		return "Box [boxW=" + boxW + ", boxH=" + boxH + ", boxL=" + boxL + ", full=" + full + "]";
	}
}