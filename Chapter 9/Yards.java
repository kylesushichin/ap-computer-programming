import java.util.Random;
public class Yards extends Player
{
    Random thing = new Random();
    public Yards(int x)
    {
        super(x);
    }
    public void getStats()
    {
        super.getStats();
        System.out.println((thing.nextInt(50)+20) + " yards ran");
    }
}