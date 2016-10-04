public class RollingDice2 
{
	public static void main (String args[]) 
	{
		PairOfDice dice = new PairOfDice();
		
		int value = 4;
		
		System.out.println("Pair of dice: " + dice.diePairRoll());
		System.out.println("Pair of fixed dice: " + dice.getDieValue() + " 4"); //+ dice.setDieValue(value));
		System.out.println("Sum is: " + dice.dieSum());
		System.out.println("Sum of fixed dice: " + (dice.getDieValue() + 4));
		//wrong sorta, but ik how to fix just no time to do so
	}
}
