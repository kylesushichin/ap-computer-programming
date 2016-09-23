import java.util.*;
public class Round 
{
	public static void main (String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		int up, down;
		System.out.print("Please scan a number to have it rounded up and down: ");
		double enter = scan.nextDouble();
		up = (int)Math.ceil(enter);
		down = (int)Math.floor(enter);
		System.out.println(enter + " rounded up is " + up + ", and " + down + " rounded down.");
	}
}
