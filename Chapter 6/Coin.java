public class Coin
{
    private final int HEADS = 0;
    private final int TAILS = 1;
    
    private int face;
    //initial flip
    public Coin()
    {
        flip();
    }
    //flips coin by random choosing face value
    public void flip()
    {
        face = (int) (Math.random() * 2);
    }
    //returns true if face = heads
    public boolean isHeads()
    {
        return (face == HEADS);
    }
    //returns the current face of coin as a string.
    public String toString()
    {
        String faceName;
        if (face == HEADS)
        {
            faceName = "Heads";
        }
        else
        {
            faceName = "Tails";
        }
        return faceName;
    }
    
}