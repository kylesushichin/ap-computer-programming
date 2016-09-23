import java.util.Random;
public class UnitCircle
{
    public static void main(String args[])
    {
        Random generator = new Random();
        double randomx1;
        double randomx2;
        
        randomx1 = generator.nextInt(21)+20;
        
        randomx2 = Math.toRadians(randomx1);
        
        double sine;
        double tangent;
        double cosine;
        
        sine = Math.sin(randomx2);
        tangent = Math.tan(randomx2);
        cosine = Math.cos(randomx2);
        
        System.out.print("random number: " + randomx1 + " sine: " + sine + " cosine: " + cosine + " tangent: " + tangent);
        
    }
}