
public class Cube extends Shape
{
    public Cube(int a, int b, int c)
    {
        super(a, b, c);
    }
    public void setCube()
    {
        double area = 6*(Math.pow(a,2));
        double volume = Math.pow(a,3);
        
        System.out.printf("Area of a cube: %.2f", area);
        System.out.printf("\nVolume of a cube: %.2f", volume);
    }
}