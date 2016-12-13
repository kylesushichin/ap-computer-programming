public class Sphere extends Shape
{
    public Sphere(int a, int b, int c)
    {
        super(a, b, c);
    }
    public void setSphere()
    {
        double circumference = 2 * (Math.PI) * a;
        double volume = (4/3)*(Math.PI)*(Math.pow(a,3));
        
        System.out.printf("\nCircumference of a sphere: %.2f", circumference);
        System.out.printf("\nVolume of a sphere: %.2f", volume);
    }
}