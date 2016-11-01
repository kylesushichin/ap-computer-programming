import java.util.Random;
public class PP5
{
    public static void main(String args[])
    {
    	Random gen = new Random();
        PairOfDice dice = new PairOfDice();
		
		int value = gen.nextInt(6) + 1;
		int limit = 0;
		int boxcar = 0; 
		for(int starting = 10000; starting >= 0; starting--)
		{
		    dice.diePairRoll();
		    if (dice.dieSum() == 12)
		    {
		        boxcar++;
		    }
		}
		System.out.println(boxcar);
    }
}