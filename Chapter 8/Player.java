import java.util.*;
public class Player
{
    int[] playerHand;
    
    public Player()
    {
        playerHand = new int [26];
    }
    
    public void addCard(int index,int a)
    {
        //for( int index = 0; index < playerHand.length; index++)
        {
            playerHand[index] = a;
        }
    }
    
    public int[] getHand()
    {
        return playerHand;
    }
}