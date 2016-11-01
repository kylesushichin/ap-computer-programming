public class PairOfDice 
{
	private int die1, die2, sum, cheatDie;
	private String diceRolled;
	//die1 = new Die();
	//die2 = new Die();
	Die die = new Die();
	Die d2 = new Die();
	
	public PairOfDice() 
	{
		die1 = die.roll();
		die2 = die.roll();
	}
	
	public void setDieValue()
	{
		
	}
	public int getDieValue()
	{
		return die.getFaceValue();
	}
	
	public int diePairRoll() 
	{
		return die.roll() + d2.roll();
	}
	
	public int dieSum() 
	{
		sum = die1 + die2;
		return sum;
	}
}