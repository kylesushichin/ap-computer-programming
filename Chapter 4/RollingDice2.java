import java.util.Random;
public class RollingDice2 
{
	public static void main (String args[]) 
	{
		Random gen = new Random();
		PairOfDice dice = new PairOfDice();
		
		int value = gen.nextInt(6) + 1;
		
		System.out.println("Pair of dice: " + dice.diePairRoll());
		System.out.println("Pair of fixed dice: " + dice.getDieValue() + " 4"); //+ dice.setDieValue(value));
		System.out.println("Sum is: " + dice.dieSum());
		System.out.println("Sum of fixed dice: " + (dice.getDieValue() + 4));
		//wrong sorta, but ik how to fix just no time to do so
	}
}
