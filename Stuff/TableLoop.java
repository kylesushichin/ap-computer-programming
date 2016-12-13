public class TableLoop
{
	public static void main(String args[])
	{
		int j = 1;
				
		System.out.println("N     10*N     100*N     1000*N");
		
		while(j < 6)
		{
			System.out.println(" ");
			System.out.print(j + "     " + j*10 + "       " + j*100 + "       " + j*1000);
			j++;
					
		}
		
	}


}