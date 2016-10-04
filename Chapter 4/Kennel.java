import java.util.*;
public class Kennel 
{
	public static void main (String [] DavidRenaldsOwesMeFourDollars) 
	{
		Scanner input = new Scanner (System.in);
		
		String name;
		int age;
	
		System.out.print("What is your dog's name: ");
		name = input.nextLine();
		System.out.print("What is their age: ");
		age = input.nextInt();
		
		Dog dog = new Dog (name, age);
		
		dog.setDogYears();
		
		System.out.println("Your dog, " + dog.name() + ", is " + dog.getDogYears() + " years old compared to a human.\n");
		System.out.println(dog.toString());
	}
}
