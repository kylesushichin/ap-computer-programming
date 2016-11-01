import java.util.*;
public class Spacer 
{
	ArrayList<String> code = new ArrayList<String>();
	private final int PER_LINE = 5;
	public void space(int i)
	{
		if(i%PER_LINE==0)
		{
			System.out.println();
		}
	}
}
