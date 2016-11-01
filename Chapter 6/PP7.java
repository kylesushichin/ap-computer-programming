import java.util.*;
public class PP7
{
	public static void main (String args[])
	{
		Shapes shape = new Shapes();
		Scanner input = new Scanner(System.in);
		boolean a = true;
		while(a == true)
		{
			System.out.print("Please choose a, b, c, or d: ");
			String choice = input.nextLine();
			switch(choice.toLowerCase())
			{
			case "a":
				shape.a();
				a = false;
				break;
			case "b":
				shape.b();
				a = false;
				break;
			case "c":
				shape.c();
				a = false;
				break;
			case "d":
				shape.d();
				a = false;
				break;
			default:
				System.out.print("Please try again. ");
			}
		}
	}
}