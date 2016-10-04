public class Dog 
{
	private int ageConv, dogAge;
	private String dName;
	
	public Dog(String name, int age) 
	{
		dName = name;
		ageConv = age;
		dogAge = age;
	}
	
	//gets dog age
	public int age() 
	{
		return dogAge;
	}
	
	//sets and gets dogs name
	public String name() 
	{
		return dName;
	}
	//converts dog years
	public void setDogYears()
	{
		ageConv = dogAge * 7;
	}
	
	//returns converted years
	public int getDogYears() 
	{
		return ageConv;
	}

	//toString method
	public String toString() 
	{
		return "Dog [ageConv=" + ageConv + ", dogAge=" + dogAge + ", dName=" + dName + "]";
	}
	
}
