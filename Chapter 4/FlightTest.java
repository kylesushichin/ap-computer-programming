import java.util.*;
public class FlightTest
{
	public static void main (String args[]) 
	{
		Scanner input = new Scanner (System.in);
		
		String name = "North East";
		int number = 508;
		
		String start, end;
		
		System.out.print("Starting City: ");
		start = input.nextLine();
		System.out.print("Destination City: ");
		end = input.nextLine();
		
		Flight flight = new Flight();
		
		flight.setName(name);
		flight.setNum(number);
		flight.setStart(start);
		flight.setEnd(end);
		
		System.out.print(flight.toString());
		
	}
}
