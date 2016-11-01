public class PP6
{
    public static void main(String args[])
    {
        Coin c1 = new Coin();
        System.out.println("The coin is starting on " + c1.toString());
        
        int heads = 0;
        int tails = 0;
        for ( int flips = 100; flips > 0; flips--)
        {
            c1.flip();
            if(c1.isHeads())
            {
                heads++;
            }
            else
            {
                tails++;
            }
        }
        System.out.println("The coin landed on heads " + heads + " times.");
        System.out.println();
        System.out.println("The coin landed on tails " + tails + " times.");
    }
}