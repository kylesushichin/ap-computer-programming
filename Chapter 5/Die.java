public class Die 
{
	private final int MAX = 6;
	private int faceValue;
	
	{
		faceValue = 1;
	}
	
	public int roll() 
	{
		faceValue = (int)(Math.random() * MAX) + 1;
		
		return faceValue;
	}
	
	public void setFaceValue(int value) 
	{
		faceValue = value;
	}
	public int getFaceValue()
	{
		return faceValue;
	}
}
