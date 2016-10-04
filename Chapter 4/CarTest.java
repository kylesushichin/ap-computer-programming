import java.util.*;
public class CarTest
{
	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);
		String make1, make2, make3, model1, model2, model3;
		int year1, year2, year3;
		
		System.out.print("Please enter the make of the first car: ");
		make1 = input.nextLine();
		System.out.print("Please enter the model of the first car: ");
		model1 = input.nextLine();
		System.out.print("Please enter the year of the first car: ");
		year1 = input.nextInt();
		Car car1 = new Car(make1, model1, year1);
		
		System.out.print("Please enter the make of the second car: ");
		make2 = input.nextLine();
		make2 = input.nextLine();
		System.out.print("Please enter the model of the second car: ");
		model2 = input.nextLine();
		System.out.print("Please enter the year of the second car: ");
		year2 = input.nextInt();
		Car car2 = new Car(make2, model2, year2);
		
		System.out.print("Please enter the make of the third car: ");
		make3 = input.nextLine();
		make3 = input.nextLine();
		System.out.print("Please enter the model of the third car: ");
		model3 = input.nextLine();
		System.out.print("Please enter the year of the third car: ");
		year3 = input.nextInt();
		Car car3 = new Car(make3, model3, year3);
		
		System.out.println("");
		
		System.out.println("Car Year\tCar Make\tCar Model\tAntique?");
		System.out.println("--------\t--------\t---------\t--------");
		System.out.println(car1.getCarYear() + "\t\t" + car1.getMake() + "\t\t" + car1.getModel() + "\t\t" + car1.isAntique());
		System.out.println();
		System.out.println(car2.getCarYear() + "\t\t" + car2.getMake() + "\t\t" + car2.getModel() + "\t\t" + car2.isAntique());
		System.out.println();
		System.out.println(car3.getCarYear() + "\t\t" + car3.getMake() + "\t\t" + car3.getModel() + "\t\t" + car3.isAntique());
		System.out.println();
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());

	}
}
