public class Flight 
{
	private String fName, fStart, fEnd;
	private int fNum;
	
	public Flight() {
		fName = null;
		int fNum = 0;
		fStart = null;
		fEnd = null;
	}
	
	public void setName(String name)
	{
		fName = name;
	}
	public String getName()
	{
		return fName;
	}
	public void setStart(String start)
	{
		fStart = start;
	}
	public String getStart() 
	
	}
	public void setEnd(String end) 
	{
		fEnd = end;
	}
	public String getEnd() 
	{
		return fEnd;
	}
	public void setNum(int number) 
	{
		fNum = number;
	}
	public int getNum() 
	{
		return fNum;
	}
	
	public String toString() 
	{
		return "Flight " + fName + " " + fNum + " out of " + fStart + " will be landing at " + fEnd;
	}
}
