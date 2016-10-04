import java.util.*;
import java.text.*;
public class BoxTest 
{
	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.####");
		double height, width, length;
		boolean fullBox = false;
		
		System.out.print("Enter a box's height: ");
		height = input.nextDouble();
		System.out.print("Enter a box's width: ");
		width = input.nextDouble();
		System.out.print("Enter a box's length: ");
		length = input.nextDouble();
		System.out.print("Is the box full? Yes or No: ");
		String choice = input.nextLine();
		choice = input.nextLine();
		
		if(choice.length() == 3) 
		{
			fullBox = true;
			//box.setFull(fullBox);
		}
		else
		{
			fullBox = false;
			//box.setFull(fullBox);
		}
		
		Box box = new Box (height, width, length, fullBox);
		
		box.setFull(fullBox);
		
		System.out.println("Height\tWidth\tLength\tFull?");
		System.out.println("------\t-----\t------\t-----\n");
		System.out.println(box.getHeight() + "\t" + box.getWidth() + "\t" + box.getLength() + "\t" + box.getFull());
		
		System.out.println(box.toString());
		
		//logic error: full box boolean only returns true, even when false
	}
}
