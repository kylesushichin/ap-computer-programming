
public class FlipRace
{
    public static void main(String args[])
    {
        int counter = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        
        System.out.println("The side facing up initially for coin 1 is : " + coin1.toString());
        System.out.println("The side facing up initially for coin 2 is : " + coin2.toString());
        
        
        
        
        while (counter < 3 && counter2 < 3 )
        {
            coin1.flip();
            coin2.flip();
            if ( coin1.isHeads())
            {
                counter ++;
                counter3 ++;
            }
            else
            {
                counter3 ++;
                counter = 0;
            }
            if ( coin2.isHeads())
            {
                counter2 ++;
                counter4 ++;
            }
            else
            {
                counter4 ++;
                counter2 = 0;
            }
            System.out.println("Coin 1 Flips:" + counter3 + " Toss:" + coin1.toString() + "\tCoin 2 Flips:" + counter4 + " Toss:" + coin2.toString() + "\tTotal heads C1 : " + counter + "\tTotal heads C2: " + counter2);
        }
        if (counter == 3 && counter2 == 3)
        {
            System.out.println("This is a tie");
        }
        else if ( counter == 3 && counter2 != 3 )
        {
            System.out.println("Winner is Coin 1 at " + counter3 + " flips");
        }
        else if ( counter2 == 3 && counter != 3 )
        {
            System.out.println("Winner is Coin 2 at " + counter4 + " flips");
        }
    }
}