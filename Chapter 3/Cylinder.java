import java.util.Random;
public class Cylinder
{
    public static void main(String args[])
    {
        Random generator = new Random();
        int radius;
        int height;
        double volume;
        double surface_area;
        
        radius = generator.nextInt(20)+1;
        height = generator.nextInt(20)+1;
        
        volume = (Math.PI)*(Math.pow(radius, 2))*(height);
        surface_area = 2*(Math.PI)*(radius)*(height);
        
        System.out.print("Volume: " + volume + "\nSurface Area: " + surface_area);
        
        
        
        
    }
}