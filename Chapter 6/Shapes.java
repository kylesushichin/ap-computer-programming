public class Shapes 
{
	private String shape;
	private int max = 10;
	
	public String a()
	{
		for(int i = max; i > 0; i--)
		{
			for(int j = max; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
			max--;
		}
		return shape;
	}
	public String b()
	{
		for(int i = max-1; i >= 0; i--)
		{
			for(int j = i-1; j >= 0; j--)
			{
				System.out.print(" ");
			}
			for(int l = max-i; l > 0; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return shape;
	}
	public String c()
	{
		for(int i = max; i > 0; i--)
		{
			for(int l = max-i; l >= 1; l--)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return shape;
	}
	public String d()
	{
		/*for(int i = max/2; i > 0; i--){
			for(int j = i-1; j >= 0; j--){
				System.out.print(" ");
			}
			for(int l = 0; l < i; l+=2){
				System.out.print("*");
			}
			System.out.println();
		}
		/*for(int i = max/2; i > 0; i--){
			for(int l = max-i; l > 0; l--){
				System.out.print("*");
			}
			for(int j = i-1; j >= 0; j--){
				System.out.print(" ");
			}
			System.out.println();
		}*/
		for(int i = 0; i < max; i++)
		{
			for(int j = 2; j <= Math.ceil(Math.abs((double)i-(double)(max/2)+0.5)); j++)
			{
				System.out.print(" ");
			}
			for(int l = 0; l < 2*(max/2-Math.ceil(Math.abs((double)i-(double)(max/2)+0.5)))+1; l++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}	
		return shape;
	}
}