import java.util.Random;
public class Catches extends Player
{
    Random ran = new Random();
    public Catches(int x)
    {
        super(x);
    }
    public void getStats()
    {
        System.out.println((ran.nextInt(19)+1) + " catches");
    }
}