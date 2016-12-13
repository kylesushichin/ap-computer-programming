import java.util.Random;
public class Fumble extends Catches
{
    Random ran = new Random();
    public Fumble(int x)
    {
        super(x);
    }
    public void getStats()
    {
        System.out.println((ran.nextInt(19)+1) + " fumbles");
    }
}