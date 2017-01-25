public class DogTest
{
    public static void main(String[] args)
    {
        Yorkshire a = new Yorkshire("Yorky");
        Labrador b = new Labrador("Labrador" , "Black");
        
        System.out.println(a.getName() + " says " + a.speak() + " " + a.avgBreedWeight() + " weight");
        System.out.println(b.getName() + " says " + b.speak() + " " + b.avgBreedWeight() + " weight");
    }
}