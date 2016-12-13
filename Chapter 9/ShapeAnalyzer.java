import java.util.Random;
public class ShapeAnalyzer
{
    public static void main(String args[])
    {
        Random gen = new Random();
        
        Cube a = new Cube((gen.nextInt(10) + 1), (gen.nextInt(10) + 1), (gen.nextInt(10) + 1));
        Sphere b = new Sphere((gen.nextInt(10) + 1), (gen.nextInt(10) + 1), (gen.nextInt(10) + 1));
        
        a.setCube();
        b.setSphere();
    }
}