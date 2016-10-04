import java.util.*;
public class Lights 
{
	enum choice {off,on};
	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lights \"on\" or \"off\": ");
		
		String state = input.nextLine();
		
		choice.valueOf(state);
		Bulb bulb = new Bulb();
		bulb.setLights(state);
		
		System.out.println("The lights are " + bulb.getLights());
		System.out.println(bulb.toString());

		
	}
}
