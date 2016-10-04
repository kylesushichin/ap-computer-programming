public class Car 
{
	private final int currentYear = 2016;
	private String carMake, carModel;
	private int carYear, altCarYear;
	
	public Car(String make, String model, int year) 
	{
	carMake = make;
	carModel = model;
	carYear = year;
	}
	
	public String getMake() 
	{
		return carMake;
	}
	public String getModel() 
	{
		return carModel;
	}
	public int getCarYear() 
	{
		return carYear;
	}
	
	//determines if the car is antique
	public boolean isAntique() 
	{
		altCarYear = currentYear - carYear;
		if( altCarYear > 45)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString() 
	{
		return "Car [currentYear=" + currentYear + ", carMake=" + carMake + ", carModel=" + carModel + ", carYear="	+ carYear + ", altCarYear=" + altCarYear + "]";
	}
}
